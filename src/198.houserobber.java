class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        
        int[] best = new int[nums.length];
        
        for(int i = 0; i < best.length; i ++){
            best[i] = -1;
        }
        
        return helper(nums, 0, best);
    }
    
    public int helper(int[] nums, int idx, int[] best){
        if(idx >= nums.length) return 0;
        
        if(best[idx] != -1) return best[idx];
        
        int take = nums[idx] + helper(nums, idx + 2, best);
        int notTake = helper(nums,idx + 1, best);
        
        best[idx] = Math.max(take, notTake);
        
        return best[idx];
    }
}