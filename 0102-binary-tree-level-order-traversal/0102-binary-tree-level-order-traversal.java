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
    private List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        return output;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;

        if (output.size() <= depth) {
            List<Integer> inside = new ArrayList<>();
            inside.add(node.val);
            output.add(inside);
        } else {
            output.get(depth).add(node.val);
        }

        depth += 1;
        dfs(node.left, depth);
        dfs(node.right, depth);
        depth -= 1;
    }
}