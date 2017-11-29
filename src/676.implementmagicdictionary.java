class MagicDictionary {
    Set<String> s = new HashSet<>();
    /** Initialize your data structure here. */
    public MagicDictionary() {
        return;
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String s:dict){
            this.s.add(s);
        }
        for(String s: this.s)
            System.out.println(s);
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        for(int i = 0; i < word.length(); i++){
            for(char c = 'a'; c <= 'z'; c++){
                String newWord = word.substring(0,i) + Character.toString(c) + word.substring(i + 1);
                if (newWord.equals(word)) continue;
                if(s.contains(newWord)) return true;
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */