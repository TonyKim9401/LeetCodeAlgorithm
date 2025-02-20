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
    private int currentDepth = 0;
    private int maxDepth = Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        dfs(root);
        return maxDepth;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        currentDepth += 1;
        maxDepth = Math.max(maxDepth, currentDepth);

        dfs(node.left);
        dfs(node.right);
        currentDepth -= 1;
    }
}