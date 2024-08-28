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
        Stack<ListNode> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow);
            System.out.println(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) slow = slow.next;

        while (!stack.isEmpty()) {
            ListNode a = stack.pop();
            
            if (slow == null || a.val != slow.val) return false;
            slow = slow.next;
        }
        return true;
    }
}