class Solution {
    public Set<List<Integer>> s = new HashSet();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer> rem_nums = new ArrayList<Integer>();
        for(int i:nums){
            rem_nums.add(i);
        }
        permuteHelper(new ArrayList<Integer>(), rem_nums);
        return new ArrayList<List<Integer>>(s);
    }
    public void permuteHelper(List<Integer> cur_perm, ArrayList<Integer> rem_nums){
        if(rem_nums.size() == 0){
            s.add(cur_perm);
            return;
        }
        for(int i = 0; i < rem_nums.size(); i++){
            ArrayList<Integer> temp_cur_perm = new ArrayList<>(cur_perm);
            temp_cur_perm.add(rem_nums.get(i));
            ArrayList<Integer> temp = new ArrayList<>(rem_nums);
            temp.remove(i);
            permuteHelper(temp_cur_perm, temp);
        }
    }
}