public class Solution {
    HashSet&lt;Integer&gt; s = new HashSet&lt;&gt;();
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i &lt;nums.length-1; i ++){
            if(s.contains(nums[i])) continue;
            for(int j = i+1; j&lt; nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] a = {i, j};
                    return a;
                }
            }
        }
        int[] a = {0,0};
        return a;
    }
}