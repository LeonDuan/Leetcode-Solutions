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
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBSTHelper(TreeNode root, long lLimit, long uLimit) {
        if(root == null) return true;
        if(root.val &gt;= uLimit || root.val &lt;= lLimit) return false;
        else{
            return isValidBSTHelper(root.left, lLimit, root.val) &amp;&amp; isValidBSTHelper(root.right, root.val, uLimit);
        }
    }
}