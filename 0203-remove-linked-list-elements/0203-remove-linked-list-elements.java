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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode curNode = dummy;

        while (curNode.next != null) {
            if (curNode.next.val == val) {
                curNode.next = curNode.next.next;
                continue;
            }
            curNode = curNode.next;
        }
        return dummy.next;
    }
}