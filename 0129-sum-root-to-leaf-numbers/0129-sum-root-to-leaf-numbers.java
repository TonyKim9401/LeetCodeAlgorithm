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
    public int sumNumbers(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;
        
        dfs(root.left, root.val);
        dfs(root.right, root.val);
        return output;
    }

    private void dfs(TreeNode node, int value) {
        if (node == null) return;

        value *= 10;
        value += node.val;

        if (node.left == null && node.right == null) {
            output += value;
            return;
        }

        if (node.left != null) {
            dfs(node.left, value);
        }
        if (node.right != null) {
            dfs(node.right, value);
        }
    }
}