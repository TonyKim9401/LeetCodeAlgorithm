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
    private int sequence = 0;
    public int kthSmallest(TreeNode root, int k) {
        sequence = k;
        dfs(root);
        return output;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        
        dfs(node.left);
        sequence -= 1;
        if (sequence == 0) output = node.val;
        
        dfs(node.right);
    }
}