public class Solution {
    public List&lt;List&lt;String&gt;&gt; groupAnagrams(String[] strs) {
        HashMap &lt;String, List&gt; m = new HashMap&lt;&gt;();

        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if(!m.containsKey(sortedStr)){
                List newList = new ArrayList&lt;&gt;();
                newList.add(str);
                m.put(sortedStr, newList);
            }
            else {
                m.get(sortedStr).add(str);
            }
        }

        List&lt;List&lt;String&gt;&gt; toReturn = new ArrayList&lt;&gt;();
        for (List li:m.values()){
            toReturn.add(li);
        }
        return toReturn;
    }
}