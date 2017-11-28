class Solution {
    public int findShortestSubArray(int[] nums) {
        int max_int = 0;
        int max_freq = 0;
        int shortest_len = Integer.MAX_VALUE;
        
        Map&lt;Integer, Integer&gt; m = new HashMap();
        Map&lt;Integer, Integer[]&gt; len = new HashMap();
        for(int i = 0; i &lt; nums.length; i++){
            int num = nums[i];
            
            if(!m.containsKey(num)){
                m.put(num, 1);
                len.put(num, new Integer[]{i,i});
            }
            else{
                m.put(num, m.get(num) + 1);
                Integer arr[] = len.get(num);
                arr[1] = i;
                len.put(num, arr);
            }
            
            int cur_int = num;
            int cur_freq = m.get(cur_int);
            int cur_len = len.get(cur_int)[1] - len.get(cur_int)[0] + 1;
            
            if(cur_freq &gt; max_freq || (cur_freq == max_freq &amp;&amp; cur_len &lt; shortest_len)){
                max_int = cur_int;
                max_freq = cur_freq;
                shortest_len = cur_len;
            }

        }
        return shortest_len;
    }
}