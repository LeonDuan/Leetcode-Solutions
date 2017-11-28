class Solution:
    def reverseBetween(self, head, m, n):
        if head is None:
            return None
        
        m -= 1
        n -= 1
        
        last_before_reverse = None
        for i in range(m):
            if i == 0:
                last_before_reverse = head
            else:
                last_before_reverse = last_before_reverse.next

        if m == 0:
            cur = head
        else:
            cur = last_before_reverse.next
        first = cur
        prev = None
        
        
        for i in range(m,n+1):
            if cur is not None:
                next_cur = cur.next
                cur.next = prev
            else:
                next_cur = head
            prev = cur
            cur = next_cur
            
        temp = prev
        while temp is not None:
            print(temp.val, end="")
            temp = temp.next
        
        if last_before_reverse is not None:
            last_before_reverse.next = prev
        else:
            head = prev
        
            
        first.next = cur
        
        
        return head
        