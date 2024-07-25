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
    public int averageOfSubtree(TreeNode root) {
        averageCheck(root);
        return output;
    }

    public int[] averageCheck(TreeNode node) {
        if (node == null) return new int[]{0, 0};

        int[] left = averageCheck(node.left);
        int[] right = averageCheck(node.right);

        int sum = left[0] + right[0] + node.val;
        int count = left[1] + right[1] + 1;

        if (sum / count == node.val) output += 1;
        return new int[]{sum, count};
    }
}