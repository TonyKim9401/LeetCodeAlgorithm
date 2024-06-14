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
        reverseNode(root.left, root.right, 1);
        return root;
    }

    public void reverseNode(TreeNode left, TreeNode right, int depth) {
        if (left == null && right == null) return;

        if (depth % 2 == 1) {
            int leftValue = left.val;
            int rightValue = right.val;
            left.val = rightValue;
            right.val = leftValue;
        }
        depth += 1;
        reverseNode(left.left, right.right, depth);
        reverseNode(left.right, right.left, depth);
    }
}