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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameTreeHelper(p, q);
    }
    public boolean isSameTreeHelper(TreeNode p, TreeNode q){
        if(p == null &amp;&amp; q == null) return true;
        if(!((p == null) == (q == null))) return false;
        if(!(p.val == q.val)){
            return false;
        }
        return isSameTreeHelper(p.left, q.left) &amp;&amp; isSameTreeHelper(p.right, q.right);
    }
}