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
    private List<Integer> list = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return builder(list, 0, list.size()-1);
    }

    public TreeNode builder(List<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;

        TreeNode node = new TreeNode(list.get(mid));
        node.left = builder(list, start, mid - 1);
        node.right = builder(list, mid + 1, end);
        return node;
    }
}