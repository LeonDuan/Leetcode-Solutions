# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def partition(self, head, x):
        if head is None:
            return head
        
        before_head = None
        before_last = None
        after_head = None
        after_last = None
        # mid_head = None
        # mid_last = None
        cur = head
        while cur is not None:
            if cur.val &lt; x:
                before_head, before_last = self.insert(before_head, before_last, cur.val)
            
            elif cur.val &gt;= x:
                after_head, after_last = self.insert(after_head, after_last, cur.val)
            
            # else:
            #     mid_head, mid_last = self.insert(mid_head, mid_last, cur.val)
            cur = cur.next
        
        # head, last = self.join(before_head, before_last, mid_head, mid_last)
        # head, last = self.join(head, last, after_head, after_last)
        head, last = self.join(before_head, before_last, after_head, after_last)

        return head

    def insert(self, head, last, x):
        if head is None:
            node = ListNode(x)
            return (node,node)
        else:
            last.next = ListNode(x)
            return (head,last.next)
        
    def join(self, h1,l1,h2,l2):
        if h1 is None and h2 is None:
            return (None, None)
        if h1 is None:
            return (h2,l2)
        if h2 is None:
            return (h1,l1)
        l1.next = h2
        return (h1,l2)