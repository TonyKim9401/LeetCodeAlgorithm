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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean even = false;

        while (!q.isEmpty()) {
            int size = q.size();
            int prevNum = 0;
            boolean first = true;

            while (size != 0) {
                TreeNode n = q.poll();
                if (even) {
                    if (n.val % 2 != 0) return false;
                    if (!first && prevNum <= n.val) return false;
                    prevNum = n.val;
                } else {
                    if (n.val % 2 != 1) return false;
                    if (!first && prevNum >= n.val) return false;
                    prevNum = n.val;
                }

                if (n.left != null) q.add(n.left);
                if (n.right != null) q.add(n.right);
                size -= 1;
                first = false;
            }
            even = !even;
        }
        return true;
    }
}