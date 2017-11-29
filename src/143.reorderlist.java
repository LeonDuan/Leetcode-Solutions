/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }

        ListNode p1 = head, p2 = head;
        ListNode prevP1 = null;
        int steps = 0;
        while(true){
            prevP1 = p1;
            p1 = p1.next;
            p2 = p2.next;
            if(p2 == null){
                break;
            }
            p2 = p2.next;
            if(p2 == null){
                break;
            }
        }
        prevP1.next = null;
        //p1 now has the middle node
        //now reverse second list
        p2 = reverse(p1);

        //merge
        p1 = head;
        while(p1 != null && p2 != null){
            ListNode origP1Next = p1.next;
            p1.next = p2;
            p1 = p2;
            p2 = origP1Next;
        }
        return head;
    }
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode next = null;
        while(node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}