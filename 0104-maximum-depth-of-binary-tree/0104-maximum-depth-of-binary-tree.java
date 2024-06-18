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
    private int currentDepth = 0;
    public int maxDepth(TreeNode root) {
        maxDepthCheck(root);
        return output;
    }

    public void maxDepthCheck(TreeNode node) {
        if (node == null) return;

        currentDepth += 1;
        maxDepthCheck(node.left);

        if (currentDepth > output) {
            output = currentDepth;
        }

        maxDepthCheck(node.right);
        currentDepth -= 1;
    }
}