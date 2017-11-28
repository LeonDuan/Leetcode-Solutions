/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode n) {
        if(n == null) return n;
        if(n.next == null) return n;
        ListNode passToNextCall = n.next.next;
        ListNode swap1 = n;
        ListNode swap2 = n.next;
        swap2.next = swap1;
        swap1.next = swapPairs(passToNextCall);
        return swap2;
    }
}