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
    private int currentValue = 0;
    private int currentCount = 0;
    private int maxCount = 0;
    private List<Integer> maxList = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        check(root);
        int[] output = new int[maxList.size()];
        for (int i = 0; i < maxList.size(); i++) {
            output[i] = maxList.get(i);
        }
        return output;
    }

    public void check(TreeNode node) {
        if (node == null) return;

        check(node.left);

        currentCount = currentValue == node.val ? currentCount + 1 : 1;
        if (currentCount == maxCount) {
            maxList.add(node.val);
        } else if (currentCount > maxCount) {
            maxCount = currentCount;
            maxList.clear();
            maxList.add(node.val);
        }
        currentValue = node.val;
        check(node.right);
    }
}