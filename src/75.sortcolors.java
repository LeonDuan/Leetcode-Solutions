class Solution {
    public void sortColors(int[] nums) {
        int num_red = 0;
        int num_white = 0;
        int num_blue = 0;
        for(int num: nums){
            if(num == 0) num_red++;
            if(num == 1) num_white++;
            if(num == 2) num_blue++;
        }
        int idx = 0;
        while(num_red &gt; 0){
            nums[idx] = 0;
            num_red --;
            idx++;
        }
        while(num_white &gt; 0){
            nums[idx] = 1;
            num_white --;
            idx++;
        }
        while(num_blue &gt; 0){
            nums[idx] = 2;
            num_blue --;
            idx++;
        }
    }
}