public class Solution {
   public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        String result = "";
        int counter = 0;
        for(int i = num2.length()-1; i >= 0; i --){
            String inter = littleMult(num1, num2.charAt(i));
            //append 0's
            for(int j = 0; j < counter; j++){
                inter = inter + "0";
            }
            counter ++;
            result = add(result, inter);
        }
        if(result != "") {
            return result;
        }
        else{
            return "0";
        }
    }
    public String add(String tempResult, String num2){
        if((tempResult.equals("")||tempResult.equals("0"))&&(num2.equals("") || num2.equals("0"))) return "";
        String result = "";
        if(tempResult.equals("")) return num2;
        if(num2.equals("")) return tempResult;
        int carry = 0;
        int tempResultIdx = tempResult.length() -1;
        int num2Idx = num2.length()-1;
        while(true){
            int toAdd1, toAdd2;
            if(tempResultIdx < 0 && num2Idx < 0) break;
            if(tempResultIdx <0){
                toAdd1 = 0;
            }
            else{
                toAdd1 = tempResult.charAt(tempResultIdx) - '0';
            }
            if(num2Idx < 0){
                toAdd2 = 0;
            }
            else{
                toAdd2 = (num2.charAt(num2Idx) - '0');
            }
            int toAppend = carry + toAdd1 + toAdd2;
            result = toAppend%10 + result;
            if(toAppend >= 10) carry = 1;
            else carry = 0;

            tempResultIdx --;
            num2Idx --;
        }
        if(carry != 0){result = Character.toString((char)(carry + '0')) + result;}
        if(!result.equals("")) return result;
        else return "0";
    }
    public String littleMult(String num1, char num2){
        String result = "";
        int carry = 0;
        if(num2 == '0') return "0";
        for(int i = num1.length() - 1; i >= 0; i--){
            int newNum = (num1.charAt(i) - '0') * (num2 - '0') + carry;
            carry = (newNum - newNum%10)/10;
            result = Character.toString((char)(newNum % 10 + '0')) + result;
        }
        if(!(carry == 0)) result = Character.toString((char)(carry + '0')) + result;
        if(result == "") return "0";
        else return result.replaceFirst("\\[0]+","");
    }
}