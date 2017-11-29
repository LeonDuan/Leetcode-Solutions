public class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        System.out.println(a);
        String result = "";
        boolean first = true;
        if(a.length == 1){
            return a[0];
        }
        for(String cur_s: a){
            if(first){
                result = cur_s;
                first = false;
            }
            else {result = cur_s + " " + result;}
        }
        return result;
    }
}