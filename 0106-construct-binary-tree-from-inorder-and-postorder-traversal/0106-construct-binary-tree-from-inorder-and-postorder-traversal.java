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
    private int i,p;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        i = inorder.length - 1;
        p = postorder.length - 1;
        return builder(inorder, postorder, Integer.MIN_VALUE);
    }

    public TreeNode builder(int[] inorder, int[] postorder, int stop) {
        if (p < 0) return null;
        if (inorder[i] == stop) {
            i -= 1;
            return null;
        }

        TreeNode output = new TreeNode(postorder[p]);
        p -= 1;
        output.right = builder(inorder, postorder, output.val);
        output.left = builder(inorder, postorder, stop);
        return output;
    }
}