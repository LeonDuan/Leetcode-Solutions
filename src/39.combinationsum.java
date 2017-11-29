public class Solution {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<ArrayList<Integer>> s = new HashSet<>();
        if(candidates.length == 0){
            return new ArrayList<>();
        }
        rec(0, candidates, target, s, new ArrayList<Integer>());
        List<List<Integer>> results = new ArrayList<>(s);
        return results;
    }

    public void rec(int idx, int[] candidates, int target, Set<ArrayList<Integer>> results, List<Integer> soFar){

        if(target == 0) {
            results.add(new ArrayList<Integer>(soFar));
            return;
        }
        if(idx == candidates.length) return;
        if(target < 0) return;

        ArrayList<Integer> soFarClone = new ArrayList<Integer>(soFar);
        soFarClone.add(candidates[idx]);

        rec(idx, candidates, target - candidates[idx], results, soFarClone);

        rec(idx + 1, candidates, target, results, soFar);
        rec(idx + 1, candidates, target - candidates[idx], results, soFarClone);
    }
}