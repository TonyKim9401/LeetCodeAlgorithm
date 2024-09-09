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
    public int findSecondMinimumValue(TreeNode root) {
         TreeSet<Integer> s = new TreeSet<>();
         solve(root, s);

         s.pollFirst();
         if (!s.isEmpty()) return s.first();
         return -1;
    }

    public void solve(TreeNode node, TreeSet<Integer> s) {
        if (node != null) {
            s.add(node.val);
            solve(node.left, s);
            solve(node.right, s);
        }
    }
}