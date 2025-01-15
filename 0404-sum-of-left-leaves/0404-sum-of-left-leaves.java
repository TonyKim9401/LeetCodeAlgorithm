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
    public int sumOfLeftLeaves(TreeNode root) {
        // TC: O(n)
        // SC: O(n) -> recursive stack

        // 1. output global variable
        // 2. DFS -> TreeNode node
        // 3-1. root == null return;
        // 3-2. leftNode (node.left)
        // 3-3. rightNode (node.right)
        dfs(root);
        return output;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        if (node.left != null) {
            dfsLeft(node.left);
        }

        if (node.right != null) dfs(node.right);
    }

    private void dfsLeft(TreeNode leftNode) {
        if (leftNode.left == null &&
            leftNode.right == null) {
                output += leftNode.val;
        } else {
            dfs(leftNode);
        }
    }
}