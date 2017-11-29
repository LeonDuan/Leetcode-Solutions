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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> maxs = new ArrayList();
        if(root == null) return maxs;
        maxs.add(root.val);
        dfs(root, 0, maxs);
        return maxs;
    }
    
    public void dfs(TreeNode node, int level, List<Integer> maxs){
        if(node == null) return;
        if(level > maxs.size() - 1) maxs.add(node.val);
        if(node.val > maxs.get(level)) maxs.set(level, node.val);
        dfs(node.left, level + 1, maxs);
        dfs(node.right, level + 1, maxs);
    }
}