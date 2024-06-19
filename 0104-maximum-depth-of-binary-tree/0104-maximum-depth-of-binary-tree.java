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
    private int max, current;
    public int maxDepth(TreeNode root) {
        maxCheck(root);
        return max;
    }

    public void maxCheck(TreeNode node) {
        if (node == null) return;

        current += 1;
        maxCheck(node.left);

        if (current > max) max = current;
        maxCheck(node.right);
        current -= 1;
    }
}