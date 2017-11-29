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
    List<List<TreeNode>> levels = new ArrayList();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        rec(root, 0);

        List<List<Integer>> result = new ArrayList();

        for(int i = 0; i < levels.size(); i++){
            List<Integer> temp_res = new ArrayList();

            List<TreeNode> l = levels.get(i);

            if(i % 2 == 0){
                for(int j = 0; j < l.size(); j ++){
                    TreeNode cur = l.get(j);
                    temp_res.add(cur.val);
                }
            }
            else{
                for(int j = l.size()-1; j >= 0; j --){
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
        if(level >= levels.size()){
            levels.add(new ArrayList<TreeNode>());
        }
        levels.get(level).add(node);

        rec(node.left,level+1);
        rec(node.right,level+1);
    }
}