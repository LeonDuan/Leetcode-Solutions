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
        if(root.val >= uLimit || root.val <= lLimit) return false;
        else{
            return isValidBSTHelper(root.left, lLimit, root.val) && isValidBSTHelper(root.right, root.val, uLimit);
        }
    }
}