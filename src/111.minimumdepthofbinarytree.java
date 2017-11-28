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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return dfs(root, 1);
    }
    public int dfs(TreeNode node, int cur_depth){
        if (node.left == null &amp;&amp; node.right == null) return cur_depth;
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if (node.left != null){
            left = dfs(node.left, cur_depth+1);
        }
        if (node.right != null){
            right = dfs(node.right, cur_depth+1);
        }
        return Math.min(left,right);
    }
}