public class Solution {
    public int jump(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        else if(nums.length == 1){
            return 0;
        }
        
        if(Arrays.asList(nums).indexOf(0)!=-1) return 0;
        int index = nums.length - 1;
        return rec(nums, index);
        
        
        
    }
    
    public int rec(int[] nums, int index){
        if(index == 0){
            return 0;
        }
        int currentMaxRange = 0;
        for(int i = index; i &gt;= 0; i--){
            if(index - i &lt;= nums[i]){
                currentMaxRange = index - i;
            }
        }
        return 1 + rec(nums, index - currentMaxRange);
    }
}