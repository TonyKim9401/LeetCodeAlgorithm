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
    private int output = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root, false);
        return output;
    }

    private void dfs(TreeNode node, boolean leftCheck) {
        if (node == null) return;

        if (node.left == null && node.right == null && leftCheck) {
            output += node.val;
        }

        dfs(node.left, true);
        dfs(node.right, false);
    }
}