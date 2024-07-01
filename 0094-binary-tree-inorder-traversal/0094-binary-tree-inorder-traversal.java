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
    private List<Integer> output = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorderCheck(root);
        return output;
    }
    public void inorderCheck(TreeNode node) {
        if (node == null) return;

        inorderCheck(node.left);
        output.add(node.val);
        inorderCheck(node.right);
    }
}