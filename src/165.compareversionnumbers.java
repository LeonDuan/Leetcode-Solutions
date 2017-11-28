public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int longer = Math.max(v1.length, v2.length);
        for(int i = 0; i &lt; longer; i++){
            int one, two;
            if(i &gt;= v1.length) one = 0;
            else one = Integer.parseInt(v1[i]);

            if(i &gt;= v2.length) two = 0;
            else two = Integer.parseInt(v2[i]);
            if(one &gt; two){
                return 1;
            }
            else if(one &lt; two){
                return -1;
            }
            else{
                continue;
            }
        }
        return 0;
    }
}