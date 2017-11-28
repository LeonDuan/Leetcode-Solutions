class Solution {
    public Set&lt;List&lt;Integer&gt;&gt; s = new HashSet();
    
    public List&lt;List&lt;Integer&gt;&gt; permuteUnique(int[] nums) {
        ArrayList&lt;Integer&gt; rem_nums = new ArrayList&lt;Integer&gt;();
        for(int i:nums){
            rem_nums.add(i);
        }
        permuteHelper(new ArrayList&lt;Integer&gt;(), rem_nums);
        return new ArrayList&lt;List&lt;Integer&gt;&gt;(s);
    }
    public void permuteHelper(List&lt;Integer&gt; cur_perm, ArrayList&lt;Integer&gt; rem_nums){
        if(rem_nums.size() == 0){
            s.add(cur_perm);
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