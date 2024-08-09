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
        return check(root, 0) > -1;
    }

    public int check(TreeNode node, int depth) {
        if (node == null) return depth;

        int leftDepth = check(node.left, depth+1);
        int rightDepth = check(node.right, depth+1);
        if (leftDepth < 0 || rightDepth < 0 || Math.abs(leftDepth - rightDepth) > 1) return - 1;
        return Math.max(leftDepth, rightDepth);
    }
}