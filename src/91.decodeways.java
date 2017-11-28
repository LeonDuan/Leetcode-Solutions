public class Solution {
    public HashMap&lt;Integer, Integer&gt; m = new HashMap&lt;&gt;();

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

        if(index &gt;= s.length()){
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
                if(s.charAt(index + 1) &lt;= '6'){
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