/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size ++;
        }
        k = k % size;
        
        for(int i = 0; i < k; i ++){
            ListNode current = head;
            while(current.next.next != null){
                current = current.next;
            }
            ListNode secToEnd = current;
            ListNode end = secToEnd.next;
            secToEnd.next = null;
            end.next = head;
            head = end;
        }
        return head;
    }
}