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
    private int currCount, maxCount, currValue;
    private List<Integer> maxList = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        find(root);
        int[] output = new int[maxList.size()];
        for (int i = 0; i < maxList.size(); i++) {
            output[i] = maxList.get(i);
        }
        return output;
    }

    public void find(TreeNode node) {
        if (node == null) return;

        find(node.left);

        currCount = currValue == node.val ? currCount + 1 : 1;
        if (currCount == maxCount) {
            maxList.add(node.val);
        } else if (currCount > maxCount) {
            maxCount = currCount;
            maxList.clear();
            maxList.add(node.val);
        }
        currValue = node.val;

        find(node.right);
    }
}