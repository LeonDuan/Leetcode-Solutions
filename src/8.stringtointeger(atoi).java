public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.length() == 0){
            return 0;
        }
        char sign = str.charAt(0);
        int toMult = 1;
        if(sign == '-'){
            toMult  = -1;
            str = str.substring(1);
        }
        else if(sign == '+'){
            str = str.substring(1);
        }
        
        long soFar = 0;
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            if(!Character.isDigit(curr)){
                return toMult * (int)soFar;
            }
            else if(toMult == 1 && (soFar*10 + curr - '0' > Integer.MAX_VALUE)){
                return Integer.MAX_VALUE;
            }
            else if(toMult == -1 && ((-1)*(soFar*10 + curr - '0') < Integer.MIN_VALUE)){
                return Integer.MIN_VALUE;
            }
            else{
                soFar = soFar * 10 + curr - '0';
            }
        }
        return (int)soFar * toMult;
    }
}