# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def flatten(self, root):
        """
        :type root: TreeNode
        :rtype: void Do not return anything, modify root in-place instead.
        """
        self.rec(root)
        
    def rec(self, cur):
        if cur is None:
            return None
        
        left_processed = self.rec(cur.left)

        if left_processed is None:
            cur.right = self.rec(cur.right)
        else:
            right_processed = self.rec(cur.right)
            cur.right = left_processed
            
            leaf = left_processed
            while leaf.right is not None:
                leaf = leaf.right
            leaf.right = right_processed
        cur.left = None
        return cur