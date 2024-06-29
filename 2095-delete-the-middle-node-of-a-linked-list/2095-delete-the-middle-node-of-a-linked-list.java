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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode slow = node;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // 가운데 획득
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}