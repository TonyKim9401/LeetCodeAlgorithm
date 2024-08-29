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
        Stack<ListNode> stack = new Stack<>();

        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        node = head;
        while (!stack.isEmpty()) {
            ListNode s = stack.pop();
            if (node.val != s.val) return false;
            node = node.next;
        }
        return true;
    }
}