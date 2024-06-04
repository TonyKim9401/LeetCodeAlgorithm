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
    
    private int currentDepth = 0;
    private int maxDepth = 0;
    private int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        
        checkLevel(root);
        return sum;
    }

    public void checkLevel(TreeNode node) {

        if (node == null) return;
        currentDepth += 1;
        checkLevel(node.left);
    
        if (currentDepth == maxDepth) {
            sum += node.val;
        } else if (currentDepth > maxDepth) {
            sum = node.val;
            maxDepth = currentDepth;
        }

        checkLevel(node.right);
        currentDepth -= 1;
    }
}