# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if root is None:
            return[]
        
        result = []
        
        
        s = [(root,0)]
        
        while len(s) > 0:
            cur_node,level = s.pop(0)
            if cur_node is None:
                continue
            
            if len(result) < level + 1:
                result.append([])
            
            result[level].append(cur_node.val)

            s.append((cur_node.left, level + 1))
            s.append((cur_node.right, level + 1))
        return result