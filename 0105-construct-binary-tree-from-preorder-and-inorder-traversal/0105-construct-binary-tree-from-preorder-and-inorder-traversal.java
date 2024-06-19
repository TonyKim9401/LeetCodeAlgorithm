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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return builder(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode builder(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) return null;

        TreeNode node = new TreeNode(preorder[preStart]);

        int idx = 0;

        for (int i = inStart; i <= inEnd; i++) {
            if (node.val == inorder[i]) {
                idx = i;
                break;
            }
        }

        node.left = builder(preStart + 1, inStart, idx - 1, preorder, inorder);
        node.right = builder(preStart + idx - inStart + 1, idx + 1, inEnd, preorder, inorder);
        return node;
    }
}