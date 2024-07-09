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
    // count;
    private int count;
    public int countNodes(TreeNode root) {
        countNode(root);
        return count;
    }
    public void countNode(TreeNode node) {
        if (node == null) return;

        count += 1;
        countNode(node.left);
        countNode(node.right);
    }
}