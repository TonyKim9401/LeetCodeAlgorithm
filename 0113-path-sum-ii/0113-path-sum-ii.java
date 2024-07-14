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
    private List<List<Integer>> output = new ArrayList<>()
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        pathCheck(root, targetSum, new ArrayList<>(), output);
        return output;
    }

    public void pathCheck(TreeNode node, int targetSum, List<Integer> inside, List<List<Integer>> output) {
        if (node == null) return;

        target -= node.val;
        inside.add(node.val);

        if (targetSum == 0 && node.left == null && node.right == null) {
            output.add(new ArrayList<>(inside);)
            return;
        }

        pathCheck(node.left, targetSum, inside, output);
        pathCheck(node.right, targetSum, inside, output);
    }
}