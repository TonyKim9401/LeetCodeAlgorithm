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
    private int currentDepth, maxDepth, sum;
    public int deepestLeavesSum(TreeNode root) {
        getSum(root);
        return sum;
    }

    public void getSum(TreeNode node) {
        if (node == null) return;

        currentDepth += 1;
        if (currentDepth == maxDepth) {
            sum += node.val;
        } else if (currentDepth > maxDepth) {
            sum = node.val;
            maxDepth = currentDepth;
        };
        getSum(node.left);
        getSum(node.right);
        currentDepth -= 1;
    }
}