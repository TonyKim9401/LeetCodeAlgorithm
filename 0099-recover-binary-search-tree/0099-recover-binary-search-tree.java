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
    private TreeNode prev;
    private TreeNode left;
    private TreeNode right;
    public void recoverTree(TreeNode root) {
        recoverCheck(root);
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
    }

    public void recoverCheck(TreeNode node) {
        if (node == null) return;
        recoverCheck(node.left);
        if (prev != null && prev.val > node.val) {
            if (left == null) {
                left = prev;
            }
            right = node;
        }
        prev = node;
        recoverCheck(node.right);
    }
}