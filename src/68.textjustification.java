class Solution {
    public List&lt;String&gt; fullJustify(String[] words, int maxWidth) {
        List&lt;String&gt; result = new ArrayList&lt;&gt;();

        int cur_len = 0;
        List&lt;String&gt; cur_words = new ArrayList&lt;&gt;();
        for(int i = 0; i &lt; words.length; i++){
            String word = words[i];
            int word_len = word.length();

            if(cur_len == 0){
                cur_len = word_len;
                cur_words.add(word);
            }
            else {
                int afterAdd = cur_len + 1 + word_len;

                if (afterAdd &gt; maxWidth) {
                    addToResult(result, cur_words, maxWidth, false);
                    cur_words.clear();
                    cur_words.add(word);
                    cur_len = word_len;
                } else {
                    cur_len = afterAdd;
                    cur_words.add(word);
                }
            }
        }
        if(cur_words.size() != 0) {
            addToResult(result, cur_words, maxWidth, true);
        }
        return result;
    }
    public void addToResult(List&lt;String&gt; result, List&lt;String&gt; cur_words, int maxWidth, boolean lastAdd){

        int total_word_length = 0;
        int num_spaces = cur_words.size() - 1;

        for(String word: cur_words){
            total_word_length += word.length();
        }


        if(cur_words.size() == 1){
            String word = cur_words.get(0);
            int howManyZeros = maxWidth - word.length();
            for(int i = 0; i &lt; howManyZeros; i++) word += " ";
            result.add(word);
        }
        else if(!lastAdd){
            String[] spaces = new String[num_spaces];

            for(int i = 0; i &lt; spaces.length; i++){
                spaces[i] = " ";
            }

            int spaces_left = maxWidth - num_spaces -total_word_length;

            int cur_idx = 0;
            while(spaces_left &gt; 0){
                spaces[cur_idx] += " ";
                cur_idx = (cur_idx + 1) % spaces.length;
                spaces_left --;
            }

            String toAdd = "";
            for(int i = 0; i &lt; cur_words.size(); i++){
                if(i != cur_words.size() - 1) {
                    toAdd += cur_words.get(i) + spaces[i];
                }
                else{
                    toAdd += cur_words.get(i);
                }
            }

            result.add(toAdd);
        }
        else{
            String toAdd = "";
            for(String word: cur_words){
                toAdd += word + " ";
            }
            toAdd = toAdd.substring(0,toAdd.length() - 1);
            toAdd += String.format("%"+Integer.toString(maxWidth - total_word_length - num_spaces)+"s", "");
            result.add(toAdd);
        }
    }
}