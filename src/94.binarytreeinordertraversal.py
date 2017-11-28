# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        result = []
        self.rec(root,result)
        return result
    def rec(self,node,result):
        if node is None:
            return
        else:
            self.rec(node.left,result)
            result.append(node.val)
            self.rec(node.right,result)
