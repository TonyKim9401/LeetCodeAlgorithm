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
        ListNode cur = head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;

        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                int dupl = cur.val;
                while (cur != null && cur.val == dupl) cur = cur.next;
                prev.next = cur;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}