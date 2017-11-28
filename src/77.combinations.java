class Solution {
    List&lt;List&lt;Integer&gt;&gt; result = new ArrayList&lt;&gt;();
    public List&lt;List&lt;Integer&gt;&gt; combine(int n, int k) {
        List&lt;Integer&gt; l = new ArrayList&lt;&gt;();
        for(int i = 0; i &lt; n; i++){
            l.add(i+1);
        }
        rec(l, k, new ArrayList&lt;Integer&gt;(), 0);
        return result;
    }

    public void rec(List&lt;Integer&gt; arr, int k, List&lt;Integer&gt; soFar, int start){
        if(k == 0){
            result.add(new ArrayList&lt;&gt;(soFar));
            return;
        }

        for(int i = start; i &lt; arr.size(); i++){
            int num = arr.get(i);
            soFar.add(num);

            rec(arr, k - 1, soFar, i + 1);

            soFar.remove(soFar.size()-1);
        }
    }
}
