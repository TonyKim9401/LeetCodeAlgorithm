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
    private boolean output = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return output;
    }

    public void dfs(TreeNode node, int targetSum) {
        if (node == null) return;

        targetSum -= node.val;
        dfs(node.left, targetSum);
        dfs(node.right, targetSum);
        if (node.left == null && node.right == null && targetSum == 0) output = true;
    }
}