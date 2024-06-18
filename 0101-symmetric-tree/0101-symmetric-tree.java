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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricCheck(root.left, root.right);
    }

    public boolean isSymmetricCheck(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            if (left == null && right == null) return true;
            return false;
        }

        if (left.val != right.val) return false;
        return isSymmetricCheck(left.left, right.right) &&
                isSymmetricCheck(left.right, right.left);
    }
}