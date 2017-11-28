class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for(int i = 0; i &lt; nums.length; i++){
            if(i &gt; farthest) return false;
            int cur_pos_farthest = nums[i] + i;
            if(cur_pos_farthest &gt; farthest) farthest = cur_pos_farthest;
        }
        return farthest &gt;= nums.length - 1;
    }
}