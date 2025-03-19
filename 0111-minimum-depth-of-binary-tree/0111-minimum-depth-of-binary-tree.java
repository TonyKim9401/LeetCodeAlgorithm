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
class Solution {
    public int minDepth(TreeNode root) {
        return dfs(root, 1);
    }

    private int dfs(TreeNode node, int depth) {
        if (node == null) return 0;

        int leftMin = dfs(node.left, depth);
        int rightMin = dfs(node.right, depth);

        if (leftMin == 0) return rightMin;
        if (rightMin == 0) return leftMin;

        int minDepth = Math.min(leftMin, rightMin) + 1;
        
        return minDepth;
    }
}
*/
class Solution {
    public int minDepth(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        if (node.left == null && node.right == null) return 1;
        if (node.left == null) return right + 1;
        if (node.right == null) return left + 1;

        return Math.min(left, right) + 1;
    }
}