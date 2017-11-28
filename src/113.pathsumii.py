# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        results = []
        soFar = []
        self.rec(root, sum, results, soFar)
        return results

    def rec(self, cur, remain, results, soFar):

        if cur is None:
            return
        
        if cur.left is None and cur.right is None:
            if remain-cur.val == 0:
                result = soFar[:]
                result.append(cur.val)
                results.append(result)
            return
        
        soFar.append(cur.val)
        self.rec(cur.left, remain - cur.val, results, soFar)
        self.rec(cur.right, remain - cur.val, results, soFar)
        soFar.pop()
        return

                