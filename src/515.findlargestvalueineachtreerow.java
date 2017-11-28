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
    public List&lt;Integer&gt; largestValues(TreeNode root) {
        ArrayList&lt;Integer&gt; maxs = new ArrayList();
        if(root == null) return maxs;
        maxs.add(root.val);
        dfs(root, 0, maxs);
        return maxs;
    }
    
    public void dfs(TreeNode node, int level, List&lt;Integer&gt; maxs){
        if(node == null) return;
        if(level &gt; maxs.size() - 1) maxs.add(node.val);
        if(node.val &gt; maxs.get(level)) maxs.set(level, node.val);
        dfs(node.left, level + 1, maxs);
        dfs(node.right, level + 1, maxs);
    }
}