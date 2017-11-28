# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sortedListToBST(self, head):
        """
        :type head: ListNode
        :rtype: TreeNode
        """
        arr = []
        cur = head
        while cur is not None:
            arr.append(cur.val)
            cur = cur.next
            
        if len(arr) == 0:
            return None
        
        mid = (len(arr)-1)//2
        root = TreeNode(arr[mid])
        
        if len(arr) == 1:
            return root
        
        root.left = self.rec(arr, 0,mid-1)
        root.right = self.rec(arr, mid+1,len(arr)-1)
        return root
        
    def rec(self, arr, start, end):
        if start &gt; end:
            return None
        mid = (start + end)//2
        cur_node = TreeNode(arr[mid])
        if start != mid:
            cur_node.left = self.rec(arr, start, mid - 1)
        if end != mid:
            cur_node.right = self.rec(arr, mid + 1, end)
        return cur_node

        
        