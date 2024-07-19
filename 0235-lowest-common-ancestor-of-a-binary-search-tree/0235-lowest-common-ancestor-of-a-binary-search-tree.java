/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        return checkLowest(root, p.val, q.val);
    }

    public TreeNode checkLowest(TreeNode node, int p, int q) {
        if (p < node.val && q < node.val) {
            return checkLowest(node.left, p, q);
        }
        if (p > node.val && q > node.val) {
            return checkLowest(node.right, p, q);
        }
        return node;
    }
}