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

    private int currentLevel = 0;
    private int maxLevel = 0;
    private int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        
        checkLevel(root);
        return sum;
    }

    public void checkLevel(TreeNode node) {

        if (node == null) return;

        currentLevel += 1;
        checkLevel(node.left);

        if (currentLevel == maxLevel) {
            sum += node.val;
        } else if (currentLevel > maxLevel) {
            sum = node.val;
            maxLevel = currentLevel;
        }
        checkLevel(node.right);
        currentLevel -= 1;
    }
}