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
    private List<Integer> nums = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        visitTreeNode(root);
        return nums.get(k-1);
    }

    public void visitTreeNode(TreeNode node) {
        if (node == null) return;

        visitTreeNode(node.left);
        nums.add(node.val);
        visitTreeNode(node.right);
    }
}