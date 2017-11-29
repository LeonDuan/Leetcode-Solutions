class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > farthest) return false;
            int cur_pos_farthest = nums[i] + i;
            if(cur_pos_farthest > farthest) farthest = cur_pos_farthest;
        }
        return farthest >= nums.length - 1;
    }
}