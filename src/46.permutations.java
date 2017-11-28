class Solution {
    
    public List&lt;List&lt;Integer&gt;&gt; result = new ArrayList&lt;&gt;();
    
    public List&lt;List&lt;Integer&gt;&gt; permute(int[] nums) {
        ArrayList&lt;Integer&gt; rem_nums = new ArrayList&lt;Integer&gt;();
        for(int i:nums){
            rem_nums.add(i);
        }
        permuteHelper(new ArrayList&lt;Integer&gt;(), rem_nums);
        return result;
    }
    
    public void permuteHelper(List&lt;Integer&gt; cur_perm, ArrayList&lt;Integer&gt; rem_nums){
        if(rem_nums.size() == 0){
            result.add(cur_perm);
            return;
        }
        for(int i = 0; i &lt; rem_nums.size(); i++){
            ArrayList&lt;Integer&gt; temp_cur_perm = new ArrayList&lt;&gt;(cur_perm);
            temp_cur_perm.add(rem_nums.get(i));
            ArrayList&lt;Integer&gt; temp = new ArrayList&lt;&gt;(rem_nums);
            temp.remove(i);
            permuteHelper(temp_cur_perm, temp);
        }
    }
    
}