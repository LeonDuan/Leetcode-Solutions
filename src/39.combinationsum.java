public class Solution {


    public List&lt;List&lt;Integer&gt;&gt; combinationSum(int[] candidates, int target) {
        Set&lt;ArrayList&lt;Integer&gt;&gt; s = new HashSet&lt;&gt;();
        if(candidates.length == 0){
            return new ArrayList&lt;&gt;();
        }
        rec(0, candidates, target, s, new ArrayList&lt;Integer&gt;());
        List&lt;List&lt;Integer&gt;&gt; results = new ArrayList&lt;&gt;(s);
        return results;
    }

    public void rec(int idx, int[] candidates, int target, Set&lt;ArrayList&lt;Integer&gt;&gt; results, List&lt;Integer&gt; soFar){

        if(target == 0) {
            results.add(new ArrayList&lt;Integer&gt;(soFar));
            return;
        }
        if(idx == candidates.length) return;
        if(target &lt; 0) return;

        ArrayList&lt;Integer&gt; soFarClone = new ArrayList&lt;Integer&gt;(soFar);
        soFarClone.add(candidates[idx]);

        rec(idx, candidates, target - candidates[idx], results, soFarClone);

        rec(idx + 1, candidates, target, results, soFar);
        rec(idx + 1, candidates, target - candidates[idx], results, soFarClone);
    }
}