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
    private int output = 0;
    public int countNodes(TreeNode root) {
        count(root);
        return output;
    }

    public void count(TreeNode node) {
        if (node == null) return;

        output+=1;
        count(node.left);
        count(node.right);
    }
}