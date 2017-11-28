class Solution {
    public List&lt;String&gt; restoreIpAddresses(String s) {
        if(s.length() == 0) return new ArrayList&lt;&gt;();
        ArrayList&lt;String&gt; result = new ArrayList&lt;&gt;();
        
        rec(s, "", result, 4);
        
        return result;
        
    }
    
    public void rec(String s_rem, String s_soFar, ArrayList&lt;String&gt; result, int to_fill){
        if(to_fill == 0 &amp;&amp; s_rem.equals("")){
            result.add(s_soFar);
        }
        
        int rem_length = s_rem.length();
        if (rem_length &gt; 4 * to_fill || rem_length &lt; to_fill){
            return;
        }
        
        int limit = (rem_length &lt; 3) ? rem_length : 3;
        for(int i = 0; i &lt; limit; i ++){
            String try_s = "";
            String next = s_rem.substring(0,i+1);
            if(!next.equals("")){
                if(next.length() &gt; 1 &amp;&amp; next.charAt(0) == '0') return;
            }
            
            if(!s_soFar.equals("")){
                try_s = s_soFar + "." + next;
            }
            else{
                try_s = next;
            }

            if(Integer.parseInt(s_rem.substring(0,i+1)) &lt;= 255){
                rec(s_rem.substring(i+1), try_s, result, to_fill - 1);
            }
        }
        
    }
}