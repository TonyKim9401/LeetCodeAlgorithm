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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public ListNode getTreeNode(ListNode head) {
        ListNode prev = head;
        ListNode fast = head;
        if (fast != null && fast.next != null) {
            prev = head;
            head = head.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return head;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode node = getTreeNode(head);
        TreeNode output = new TreeNode(node.val);
        output.left = sortedListToBST(head);
        output.right = sortedListToBST(node.next);
        return output;
    }
}