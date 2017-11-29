public class Solution {
    public int search(int[] nums, int target) {
        int hi = nums.length-1, lo = 0;
        while(hi>=lo){
            int mid = (hi+lo)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] >= nums[lo]){
                if(nums[lo] <= target && target <=nums[mid]){
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
            else{
                if(nums[mid]<= target && target <= nums[hi]){
                    lo = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
}