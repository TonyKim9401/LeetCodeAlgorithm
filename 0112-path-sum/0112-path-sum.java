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
        return hasPathCheck(root, 0, targetSum);
    }

    public boolean hasPathCheck(TreeNode node, int curSum, int targetSum) {
        if (node == null) return false;
        
        curSum += node.val;
        
        if (curSum == targetSum && node.left == null && node.right == null) {
            return true;
        }

        return hasPathCheck(node.left, curSum, targetSum) ||
                hasPathCheck(node.right, curSum, targetSum);
    }
}