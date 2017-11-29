# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def buildTree(self, preorder, inorder):
        if len(preorder) == 0:
            return None

        root = preorder[0]
        
        length = inorder.index(root)

        newNode = TreeNode(root)
        if length >= 1:
            newNode.left = self.buildTree(preorder[1:1+length], inorder[0:inorder.index(root)])
        if len(preorder)-length >= 1:
            newNode.right = self.buildTree(preorder[length+1:], inorder[inorder.index(root)+1:])
        return newNode