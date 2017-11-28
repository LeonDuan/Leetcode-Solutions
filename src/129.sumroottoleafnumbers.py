# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        results = []
        self.rec(root, 0, results)
        return sum(results)
    
    def rec(self, node, soFar, results):
        if node is None:
            return 0
        
        counter = 1
        temp = node.val
        while temp &gt; 10:
            temp /= 10
            counter += 1
        soFar = 10*counter*soFar + node.val
        
        if node.left is None and node.right is None:
            results.append(soFar)
        
        if node.left is not None:
            self.rec(node.left, soFar, results)
        if node.right is not None:
            self.rec(node.right, soFar, results)
            
        