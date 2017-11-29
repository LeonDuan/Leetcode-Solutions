class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s.length() == 0) return new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        
        rec(s, "", result, 4);
        
        return result;
        
    }
    
    public void rec(String s_rem, String s_soFar, ArrayList<String> result, int to_fill){
        if(to_fill == 0 && s_rem.equals("")){
            result.add(s_soFar);
        }
        
        int rem_length = s_rem.length();
        if (rem_length > 4 * to_fill || rem_length < to_fill){
            return;
        }
        
        int limit = (rem_length < 3) ? rem_length : 3;
        for(int i = 0; i < limit; i ++){
            String try_s = "";
            String next = s_rem.substring(0,i+1);
            if(!next.equals("")){
                if(next.length() > 1 && next.charAt(0) == '0') return;
            }
            
            if(!s_soFar.equals("")){
                try_s = s_soFar + "." + next;
            }
            else{
                try_s = next;
            }

            if(Integer.parseInt(s_rem.substring(0,i+1)) <= 255){
                rec(s_rem.substring(i+1), try_s, result, to_fill - 1);
            }
        }
        
    }
}