public class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        for(int num : nums){
            firstMissingPositiveHelper(nums, num);
        }
        for(int i = 0; i &lt; nums.length; i++){
            if(nums[i] != i+1) return i+1;
        }
        return nums.length + 1;
    }
    public void firstMissingPositiveHelper(int[] nums, int num){
        if(num &lt;= 0 || num &gt; nums.length) return;
        if(nums[num-1] == num) {
            return;
        }
        else{
            int temp = nums[num-1];
            nums[num - 1] = num;
            firstMissingPositiveHelper(nums,temp);
        }
        return;
    }
}