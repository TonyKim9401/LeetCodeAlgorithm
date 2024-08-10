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
        return dfs(root, 0) > -1;
    }

    public int dfs(TreeNode node, int depth) {
        if (node == null) return depth;

        depth += 1;
        int left = dfs(node.left, depth);
        int right = dfs(node.right, depth);

        if (Math.abs(left - right) > 1) return -1;
        return Math.max(left, right);
    }
}