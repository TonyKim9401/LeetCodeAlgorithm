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
        return getLowest(root, p, q);
    }

    public TreeNode getLowest(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return null;
        if (p.val < node.val && q.val < node.val) {
            return getLowest(node.left, p, q);
        }
        if (p.val > node.val && q.val > node.val) {
            return getLowest(node.right, p, q);
        }
        return node;
    }
}