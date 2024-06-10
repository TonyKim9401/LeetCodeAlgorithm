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
    public TreeNode reverseOddLevels(TreeNode root) {
        reverseOrder(root.left, root.right, 1);
        return root;
    }

    public void reverseOrder(TreeNode left, TreeNode right, int depth) {
        if (left == null || right == null) return;

        depth += 1;
        if (depth%2 == 0) {
            int leftValue = left.val;
            int rightValue = right.val;
            left.val = rightValue;
            right.val = leftValue;
        }
        reverseOrder(left.left, right.right, depth);
        reverseOrder(left.right, right.left, depth);
    }
}