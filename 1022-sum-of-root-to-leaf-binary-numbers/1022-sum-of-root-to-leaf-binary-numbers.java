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
    private StringBuilder sb = new StringBuilder();
    private int output = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root);
        return output;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        sb.append(node.val);

        if (node.left == null && node.right == null) {
            output += Integer.parseInt(sb.toString(), 2);
        } else {
            dfs(node.left);
            dfs(node.right);
        }
        sb.setLength(sb.length() - 1);
    }
}