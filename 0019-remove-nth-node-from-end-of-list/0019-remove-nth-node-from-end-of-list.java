/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode output = new ListNode(0, head);
        ListNode dummy = output;

        while (n > 0) {
            head = head.next;
            n -=1 ;
        }

        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;
        return output.next;
    }
}