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

        if (checkEquality(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || 
                isSubtree(root.right, subRoot);
    }

    private boolean checkEquality(TreeNode node, TreeNode subNode) {
        if (node == null && subNode == null) return true;
        if (node == null || subNode == null) return false;
        if (node.val != subNode.val) return false;
        return checkEquality(node.left, subNode.left) &&
                checkEquality(node.right, subNode.right);
    }
}