class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String s = S.replace("-","").toUpperCase();
        
        String result = "";
        int i = s.length();
        
        while(i > 0){
            result = s.substring(Math.max(0, i - K), i) + result;
            i -= K;
            if(i > 0){
                result = "-" + result;
            }
        }
        return result;
    }
}