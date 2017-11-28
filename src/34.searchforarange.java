public class Solution {

    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1}; 
        int lo = searchRangeHelper(nums, target,'R');
        if (lo == -1) return new int[]{-1,-1};
        int hi = searchRangeHelper(nums, target,'L');
        return new int[]{lo,hi};
    }

    public int searchRangeHelper(int[] nums, int target, char side){
        int lo = 0;
        int hi = nums.length - 1;

        switch (side) {

            case 'R':
                while (lo &lt;= hi) {
                    int mid = (lo + hi) / 2;

                    if (nums[mid] == target) {// found target


                        //check if it's the right most one
                        if (mid == 0 || nums[mid] &gt; nums[mid - 1]) {
                            return mid;
                        }

                        //still on the right side
                        else if (nums[mid - 1] == nums[mid]) {
                            hi = mid - 1;
                        }
                    }
                    else if(nums[mid] &lt; target){
                        lo = mid + 1;
                    }
                    else{
                        hi = mid - 1;
                    }
                }
                return -1;

            case 'L':
                while (lo &lt;= hi) {
                    int mid = (lo + hi) / 2;

                    if (nums[mid] == target) {// found target


                        //check if it's the right most one
                        if (mid == nums.length - 1 || nums[mid] &lt; nums[mid + 1]) {
                            return mid;
                        }

                        //still on the left side
                        else if (nums[mid + 1] == nums[mid]) {
                            lo = mid + 1;
                        }
                    }
                    else if(nums[mid] &lt; target){
                        lo = mid + 1;
                    }
                    else{
                        hi = mid - 1;
                    }
                }
                return -1;
        }
        return -1;
    }

}