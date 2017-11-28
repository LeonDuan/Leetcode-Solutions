/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    Map&lt;Integer, List&lt;TreeLinkNode&gt;&gt; levels = new HashMap();

    public void connect(TreeLinkNode root) {
        rec(root, 0);

        for(Integer key:levels.keySet()){
            List&lt;TreeLinkNode&gt; l = levels.get(key);
            TreeLinkNode prev = l.get(0);
            for(int i = 1; i &lt; l.size(); i ++){
                TreeLinkNode cur = l.get(i);
                prev.next = cur;
                prev = cur;
            }
        }

    }
    public void rec(TreeLinkNode node, int level){
        if(node == null){
            return;
        }
        if(!levels.containsKey (level)){
            levels.put(level, new ArrayList&lt;TreeLinkNode&gt;());
        }
        levels.get(level).add(node);

        rec(node.left,level+1);
        rec(node.right,level+1);
    }
}