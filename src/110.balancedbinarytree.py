# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isBalanced(self, root):
        return self.isBalanced_h(root)[0]
    
    def isBalanced_h(self, node):
        """
        :type root: TreeNode
        :rtype: bool
        """
        
        if node is None:
            return (True, 0)
        
        else:
            left_result = self.isBalanced_h(node.left)
            right_result = self.isBalanced_h(node.right)
            
            left_balanced, left_height = left_result
            right_balanced, right_height = right_result
            
            return (abs(left_height-right_height) &lt;= 1 and left_balanced and right_balanced, 1+max(left_height, right_height))
    