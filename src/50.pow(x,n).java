public class Solution {
    HashMap&lt;Integer, Double&gt; m = new HashMap&lt;&gt;();
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1/x;
        if(m.containsKey(n)) return m.get(n);
        double result = myPow(x,n/2)*myPow(x,n-n/2);
        m.put(n, result);
        return result;
    }
}