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
    public List<Integer> postorderTraversal(TreeNode root) {
        postorderCheck(root);
        return output;
    }

    public void postorderCheck(TreeNode node) {
        if (node == null) return;

        postorderCheck(node.left);
        postorderCheck(node.right);
        output.add(node.val);
    }
}