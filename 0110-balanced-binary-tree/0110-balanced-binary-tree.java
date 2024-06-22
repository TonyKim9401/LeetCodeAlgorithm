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
        return balanceCheck(root, 0) > -1;
    }

    public int balanceCheck(TreeNode node, int depth) {
        if (node == null) return depth;

        int left = balanceCheck(node.left, depth+1);
        int right = balanceCheck(node.right, depth+1);

        if (left < 0 || right < 0 || Math.abs(left - right) > 1) return -1;
        return Math.max(left, right);
    }
}