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
    private int sum = 0;
    private int currentDepth = 0;
    private int maxDepth = 0;
    public int deepestLeavesSum(TreeNode root) {
        depthCheck(root);
        return sum;
    }

    public void depthCheck(TreeNode node) {
        if (node == null) return;
        currentDepth += 1;
        depthCheck(node.left);

        if (currentDepth == maxDepth) {
            sum += node.val;
        } else if (currentDepth > maxDepth) {
            maxDepth = currentDepth;
            sum = node.val;
        }
        depthCheck(node.right);
        currentDepth -= 1;
    }
}