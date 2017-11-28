public class Solution {
    public boolean isPalindrome(int x) {
        if(x &lt; 0){
            return false;
        }
        if(x &lt; 10){
            return true;
        }
        String s = Integer.toString(x);
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
        return s.equals(reversed);
    }
}