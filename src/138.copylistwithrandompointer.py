class Solution(object):
    def copyRandomList(self, head):
        """
        :type head: RandomListNode
        :rtype: RandomListNode
        """
        visited = {}
        return self.rec(head, visited)

    def rec(self, node, visited):
        if node is None:
            return None

        if node not in visited:

            clone = RandomListNode(node.label)
            visited[node] = clone
            clone.next = self.rec(node.next,visited)
        else:
            clone = visited[node]
            clone.next = self.rec(node.next, visited)

        if node.random is None:
            clone.random = None
        else:
            if node.random in visited:
                clone.random = visited[node.random]
            else:
                clone.random = RandomListNode(node.random.label)
                visited[node.random] = clone.random

        return clone