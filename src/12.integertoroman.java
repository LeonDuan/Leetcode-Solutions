public class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(0,"");
        m.put(1,"I");
        m.put(2,"II");
        m.put(3,"III");
        m.put(4,"IV");
        m.put(5,"V");
        m.put(6,"VI");
        m.put(7,"VII");
        m.put(8,"VIII");
        m.put(9,"IX");
        HashMap<Integer, String> m2 = new HashMap<>();
        m2.put(0,"");
        m2.put(1,"C");
        m2.put(2,"CC");
        m2.put(3,"CCC");
        m2.put(4,"CD");
        m2.put(5,"D");
        m2.put(6,"DC");
        m2.put(7,"DCC");
        m2.put(8,"DCCC");
        m2.put(9,"CM");
        HashMap<Integer, String> m3 = new HashMap<>();
        m3.put(0,"");
        m3.put(1,"X");
        m3.put(2,"XX");
        m3.put(3,"XXX");
        m3.put(4,"XL");
        m3.put(5,"L");
        m3.put(6,"LX");
        m3.put(7,"LXX");
        m3.put(8,"LXXX");
        m3.put(9,"XC");
        
        String result = "";
            if(num >= 1000){
                int thou = (num - num%1000)/1000;
                if(thou == 1){
                    result += "M";
                }
                else if(thou == 2){
                    result += "MM";
                }
                else if(thou == 3){
                    result += "MMM";
                }
                num = num%1000;
            }
            if(num >= 100){
                int hun = (num - num%100) / 100;
                result += m2.get(hun);
                num = num%100;
            }
            if(num >= 10){
                int tens = (num - num%10)/10;
                result += m3.get(tens);
                num = num%10;
            }
            if(num >= 0){
                result += m.get(num);
            }
            return result;
    }
}