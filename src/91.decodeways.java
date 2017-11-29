public class Solution {
    public HashMap<Integer, Integer> m = new HashMap<>();

    public int numDecodings(String s) {
        if(s.length() == 0){
            return 0;
        }
        return rec(s, 0);
    }
    public int rec(String s, int index){
        if(m.containsKey(index)){
            return m.get(index);
        }

        if(index >= s.length()){
            m.put(index, 1);
            return 1;
        }
        if(s.charAt(index) == '0'){
            m.put(index, 0);
            return 0;
        }
        if(s.charAt(index) == '1'){
            if(index != s.length() - 1) {
                int result = rec(s, index + 1) + rec(s, index + 2);
                m.put(index, result);
                return result;
            }
            else{
                int result = rec(s, index+1);
                m.put(index,result);
                return result;
            }
        }
        else if(s.charAt(index) == '2'){
            if(index != s.length() - 1){
                if(s.charAt(index + 1) <= '6'){
                    int result = rec(s,index+1) + rec(s,index+2);
                    m.put(index, result);
                    return result;
                }
                else{
                    int result = rec(s, index+1);
                    m.put(index, result);
                    return result;
                }
            }
            else{
                int result = rec(s, index+1);
                m.put(index,result);
                return result;
            }
        }
        else{
            int result = rec(s, index+1);
            m.put(index, result);
            return result;
        }
    }
    
}