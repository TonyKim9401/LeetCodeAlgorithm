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
    private int i, p;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return builder(preorder, inorder, Integer.MIN_VALUE);
    }

    public TreeNode builder(int[] preorder, int[] inorder, int stop){
        if (p == preorder.length) return null;
        if (inorder[i] == stop) {
            i += 1;
            return null;
        }

        TreeNode node = new TreeNode(preorder[p]);
        p += 1;

        node.left = builder(preorder, inorder, node.val);
        node.right = builder(preorder, inorder, stop);
        return node;
    }
}