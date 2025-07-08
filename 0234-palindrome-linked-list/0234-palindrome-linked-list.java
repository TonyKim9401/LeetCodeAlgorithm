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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow;
        ListNode dummy = null;

        while (middle != null) {
            ListNode temp = middle.next;
            middle.next = dummy;
            dummy = middle;
            middle = temp;
        }

        while (dummy != null) {
            if (dummy.val != head.val) return false;
            dummy = dummy.next;
            head = head.next;
        }
        return true;
    }
}