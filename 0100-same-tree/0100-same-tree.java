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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameCheck(p, q);
    }

    public boolean isSameCheck(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            if (left == null && right == null) return true;
            return false;
        }

        if (left.val != right.val) return false;
        return isSameCheck(left.left, right.left) &&
                isSameCheck(left.right, right.right);
    }
}