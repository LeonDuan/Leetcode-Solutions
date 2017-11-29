public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List> m = new HashMap<>();

        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if(!m.containsKey(sortedStr)){
                List newList = new ArrayList<>();
                newList.add(str);
                m.put(sortedStr, newList);
            }
            else {
                m.get(sortedStr).add(str);
            }
        }

        List<List<String>> toReturn = new ArrayList<>();
        for (List li:m.values()){
            toReturn.add(li);
        }
        return toReturn;
    }
}