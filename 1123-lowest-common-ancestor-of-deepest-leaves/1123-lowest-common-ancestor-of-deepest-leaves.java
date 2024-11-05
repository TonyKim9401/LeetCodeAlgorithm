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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root, 0).node;
    }

    private ResultNode dfs(TreeNode node, int depth) {
        if (node == null) return new ResultNode(null, depth);

        depth += 1;
        ResultNode leftNode = dfs(node.left, depth);
        ResultNode rightNode = dfs(node.right, depth);

        if (leftNode.depth == rightNode.depth) return new ResultNode(node, leftNode.depth);
        else if (leftNode.depth > rightNode.depth) return leftNode;
        else return rightNode;
    }

    private class ResultNode {
        private TreeNode node;
        private int depth;

        ResultNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}