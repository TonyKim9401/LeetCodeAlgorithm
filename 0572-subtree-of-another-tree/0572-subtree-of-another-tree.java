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

    private boolean checkTree(TreeNode node, TreeNode subNode) {
        if (node == null || subNode == null) {
            return node == null && subNode == null;
        }

        if (node.val != subNode.val) return false;
        return checkTree(node.left, subNode.left) &&
                checkTree(node.right, subNode.right);
    }
}