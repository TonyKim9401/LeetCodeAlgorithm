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
        dfs(original, cloned, target);
        return output;
    }

    private void dfs(TreeNode orig, TreeNode node, TreeNode target) {
        if (node == null) return;

        if (orig == target) {
            output = node;
            return;
        }
        dfs(orig.left, node.left, target);
        dfs(orig.right, node.right, target);
    }
}