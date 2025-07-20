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
    public int minDepth(TreeNode root) {
        return dfs(root, 0) + 1;
    }

    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        if (node.left == null && node.right == null) {
            return depth;
        }
        
        depth += 1;
        int leftMin = dfs(node.left, depth);
        int rightMin = dfs(node.right, depth);

        return Math.min(leftMin, rightMin);
    }
}