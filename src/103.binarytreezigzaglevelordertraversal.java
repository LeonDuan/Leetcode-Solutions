/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List&lt;List&lt;TreeNode&gt;&gt; levels = new ArrayList();

    public List&lt;List&lt;Integer&gt;&gt; zigzagLevelOrder(TreeNode root) {
        rec(root, 0);

        List&lt;List&lt;Integer&gt;&gt; result = new ArrayList();

        for(int i = 0; i &lt; levels.size(); i++){
            List&lt;Integer&gt; temp_res = new ArrayList();

            List&lt;TreeNode&gt; l = levels.get(i);

            if(i % 2 == 0){
                for(int j = 0; j &lt; l.size(); j ++){
                    TreeNode cur = l.get(j);
                    temp_res.add(cur.val);
                }
            }
            else{
                for(int j = l.size()-1; j &gt;= 0; j --){
                    TreeNode cur = l.get(j);
                    temp_res.add(cur.val);
                }
            }

            result.add(temp_res);
        }

        return result;
    }
    public void rec(TreeNode node, int level){
        if(node == null){
            return;
        }
        if(level &gt;= levels.size()){
            levels.add(new ArrayList&lt;TreeNode&gt;());
        }
        levels.get(level).add(node);

        rec(node.left,level+1);
        rec(node.right,level+1);
    }
}