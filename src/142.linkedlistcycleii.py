# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):

        visited = set()
        return self.rec(head, visited)

    def rec(self, node, visited):
        if node is None:
            return None

        if node in visited:
            return node

        visited.add(node)
        return self.rec(node.next, visited)

        
    