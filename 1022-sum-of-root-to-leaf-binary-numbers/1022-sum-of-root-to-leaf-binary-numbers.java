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
    private int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        backtracking(root, sb);
        return sum;
    }

    public void backtracking(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append(String.valueOf(node.val));

        if (node.left == null && node.right == null) {
            sum += Integer.valueOf(sb.toString(), 2);
        } else {
            backtracking(node.left, sb);
            backtracking(node.right, sb);
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}