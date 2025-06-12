/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private TreeNode output;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        dfs(cloned, target);
        return output;
    }

    private void dfs(TreeNode node, TreeNode target) {
        if (node == null) return;

        if (node.val == target.val) {
            output = node;
            return;
        }
        dfs(node.left, target);
        dfs(node.right, target);
    }
}