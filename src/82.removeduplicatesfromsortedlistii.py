# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        toRemove = {}
        cur = head
        while cur is not None:
            if cur.val in toRemove:
                toRemove[cur.val] += 1
            else:
                toRemove[cur.val] = 1
            cur = cur.next
        
        dummy_head = ListNode(None)
        dummy_head.next = head
        
        prev = dummy_head
        cur = head
        
        while cur is not None:
            if toRemove[cur.val] >= 2:
                prev.next = cur.next
            else:
                prev = cur
            cur = cur.next
        return dummy_head.next