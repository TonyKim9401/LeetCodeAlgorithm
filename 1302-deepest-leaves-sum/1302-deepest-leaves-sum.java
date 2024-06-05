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
    private int maxDepth = 0;
    private int result = 0;
    public int deepestLeavesSum(TreeNode root) {
        depthCheck(root);
        return result;
    }

    public void depthCheck(TreeNode node) {
        if (node == null) return;
        currentDepth += 1;
        depthCheck(node.left);

        if (currentDepth == maxDepth) {
            result += node.val;
        } else if (currentDepth > maxDepth) {
            maxDepth = currentDepth;
            result = node.val;
        }

        depthCheck(node.right);
        currentDepth -= 1;
    }
}