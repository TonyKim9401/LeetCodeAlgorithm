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
    public boolean isValidBST(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean checkBST(TreeNode node, long minValue, long maxValue) {
        if (node == null) return true;
        if (node.val >= minValue || node.val <= maxValue) {
            return false;
        }
        return checkBST(node.left, minValue, node.val) && checkBST(node.right, node.val, maxValue);
    }
}