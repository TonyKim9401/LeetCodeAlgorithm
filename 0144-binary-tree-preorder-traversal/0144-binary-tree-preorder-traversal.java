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
    public List<Integer> preorderTraversal(TreeNode root) {
        preorderCheck(root);
        return output;
    }

    public void preorderCheck(TreeNode node) {
        if (node == null) return;

        output.add(node.val);
        preorderCheck(node.left);
        preorderCheck(node.right);
    }
}