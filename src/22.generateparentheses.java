public class Solution {
    ArrayList<String> solution = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
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
            if(right > left) {
                rec(left, right - 1, soFar + ")");
            }
        }
    }
}