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
    private int currentDepth, maxDepth;
    public int maxDepth(TreeNode root) {
        depthCheck(root);
        return maxDepth;
    }

    public void depthCheck(TreeNode node) {
        if (node == null) return;
        
        currentDepth += 1;
        depthCheck(node.left);
        if (currentDepth > maxDepth) {
            maxDepth = currentDepth;
        }
        depthCheck(node.right);
        currentDepth -= 1;
    }
}