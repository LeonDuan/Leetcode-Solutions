/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int node_num = 0;
        ListNode current = head;

        while(current != null){
            node_num ++;
            current = current.next;
        }

        int target = node_num - n + 1;


        if(target == 1){
            head = head.next;
            return head;
        }




        ListNode prev = null;
        int cur_idx = 1;
        current = head;

        while(cur_idx != target){
            cur_idx ++;
            prev = current;
            current = current.next;
        }
        
        prev.next = current.next;
        
        return head;
    }
}