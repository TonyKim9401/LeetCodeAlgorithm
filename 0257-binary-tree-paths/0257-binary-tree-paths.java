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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> output = new ArrayList<>();
        pathCheck(root, "", output);
        return output;
    }

    public void pathCheck(TreeNode node, String str, List<String> output) {
        str += node.val;
        if (node.left == null && node.right == null) {
            output.add(str);
            return;
        }
        if (node.left != null) {
            pathCheck(node.left, str+"->", output);
        }
        if (node.right != null) {
            pathCheck(node.right, str+"->", output);
        }
    }
}