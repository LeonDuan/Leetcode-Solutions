public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int longer = Math.max(v1.length, v2.length);
        for(int i = 0; i < longer; i++){
            int one, two;
            if(i >= v1.length) one = 0;
            else one = Integer.parseInt(v1[i]);

            if(i >= v2.length) two = 0;
            else two = Integer.parseInt(v2[i]);
            if(one > two){
                return 1;
            }
            else if(one < two){
                return -1;
            }
            else{
                continue;
            }
        }
        return 0;
    }
}