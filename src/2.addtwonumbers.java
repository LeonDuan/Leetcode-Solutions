/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                int toAdd1, toAdd2;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode result = null;
        ListNode current = null;
        int carry = 0;
        while(!(cur1 == null &amp;&amp; cur2 == null)){
            if(cur1 == null){
                toAdd1 = 0;
            }
            else{
                toAdd1 = cur1.val;
            }
            if(cur2 == null){
                toAdd2 = 0;
            }
            else{
                toAdd2 = cur2.val;
            }
            int newData;
            newData = (toAdd1+toAdd2+carry)%10;
            ListNode newNode = new ListNode(newData);
            if(toAdd1+toAdd2+carry&gt;=10){
                carry = 1;
            }
            else{
                carry = 0;
            }
            if(result == null){
                result = newNode;
                current = result;
            }
            else{
                current.next = newNode;
                current = newNode;
            }
            if(cur1!=null) {
                cur1 = cur1.next;
            }
            if(cur2!=null) {
                cur2 = cur2.next;
            }
        }
        if(carry == 1){
            current.next = new ListNode(1);
        }
        return result;
    }
}