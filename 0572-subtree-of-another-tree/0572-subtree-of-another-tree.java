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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        if (checkTree(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) ||
                isSubtree(root.right, subRoot);
    }

    private boolean checkTree(TreeNode root, TreeNode sub) {
        if (root == null || sub == null) {
            return root == null && sub == null;
        }

        if (root.val != sub.val) return false;
        return checkTree(root.left, sub.left) &&
                checkTree(root.right, sub.right);
    }
}