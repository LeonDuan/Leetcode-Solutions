public class Solution {
    ArrayList&lt;String&gt; solution = new ArrayList&lt;&gt;();
    public List&lt;String&gt; generateParenthesis(int n) {
        if(n == 0){
            solution.add("");
            return solution;
        }
        rec(n, n, "");
        return solution;
    }
    public void rec(int left, int right, String soFar){
        if(right == 0){
            solution.add(soFar);
            return;
        }
        if(left == 0){
            rec(0, right-1, soFar + ")");
        }
        else {
            rec(left - 1, right, soFar + "(");
            if(right &gt; left) {
                rec(left, right - 1, soFar + ")");
            }
        }
    }
}