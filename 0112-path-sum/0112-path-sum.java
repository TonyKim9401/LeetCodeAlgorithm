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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathCheck(root, 0, targetSum);
    }

    public boolean pathCheck(TreeNode node, int currentSum, int targetSum) {
        if (node == null) return false;

        currentSum += node.val;
        System.out.println(currentSum);

        if (currentSum == targetSum && node.left == null && node.right == null) return true;
        return pathCheck(node.left, currentSum, targetSum) ||
                pathCheck(node.right, currentSum, targetSum);
    }
}