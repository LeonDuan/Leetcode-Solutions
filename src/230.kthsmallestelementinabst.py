# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        self.nums = []
        self.dfs(root)
        return self.nums[k-1]
        
    def dfs(self, node):
        if node is None: return
        self.dfs(node.left)
        self.nums.append(node.val)
        self.dfs(node.right)