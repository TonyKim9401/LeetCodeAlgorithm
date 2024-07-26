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
    private int currentVal = 0;
    private int currentCount = 0;
    private int maxCount = 0;
    private List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        checkMode(root);
        int size = list.size();
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = list.get(i);
        }
        return output;
    }

    public void checkMode(TreeNode node) {
        if (node == null) return;

        checkMode(node.left);

        currentCount = (node.val == currentVal) ? currentCount + 1 : 1;
        if (currentCount == maxCount) {
            list.add(node.val);
        } else if (currentCount > maxCount) {
            maxCount = currentCount;
            list.clear();
            list.add(node.val);
        }
        currentVal = node.val;

        checkMode(node.right);
    }
}