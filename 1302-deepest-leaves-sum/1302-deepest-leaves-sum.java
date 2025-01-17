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
    private int maxLevel = 0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return output;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            if (level == maxLevel) {
                output += node.val;
            } else if (level > maxLevel) {
                maxLevel = level;
                output = node.val;
            }
            return;
        }

        level += 1;
        dfs(node.left, level);
        dfs(node.right, level);
    }
}