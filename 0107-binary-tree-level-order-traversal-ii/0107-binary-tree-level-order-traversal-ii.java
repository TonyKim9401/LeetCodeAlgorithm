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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        levelCheck(root, 0);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = output.size() - 1; i >= 0; i--) {
            result.add(output.get(i));
        }
        return result;
    }

    public void levelCheck(TreeNode node, int size) {
        if (node == null) return;

        if (output.size() == size) {
            output.add(new ArrayList<>());
        }

        output.get(size).add(node.val);
        levelCheck(node.left, size + 1);
        levelCheck(node.right, size + 1);
    }
}