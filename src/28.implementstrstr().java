public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() &lt; needle.length()) return -1;
        for (int i = 0; i &lt;= haystack.length() - needle.length(); i++){
            if (needle.equals(haystack.substring(i,i+needle.length()))){
                return i;
            }
        }
        return -1;
    }
}