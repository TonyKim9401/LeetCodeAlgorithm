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
    public boolean isBalanced(TreeNode root) {
        return height(root, 0) > -1;
    }

    public int height(TreeNode node, int depth) {
        if (node == null) return depth;

        int left = height(node.left, depth + 1);
        int right = height(node.right, depth + 1);

        if (left < 0 || right < 0 || Math.abs(left - right) > 1) return -1;
        return Math.max(left, right);
    }
}