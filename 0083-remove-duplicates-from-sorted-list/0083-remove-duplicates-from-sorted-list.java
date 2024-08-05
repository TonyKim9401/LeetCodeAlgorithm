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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode output = head;

        while (output != null && output.next != null) {
            while (output.next != null && output.val == output.next.val) {
                output.next = output.next.next;
            }
            output = output.next;
        }
        return head;
    }
}