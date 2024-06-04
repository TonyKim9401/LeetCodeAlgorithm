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
    private List<Integer> maxValList = new ArrayList<>();

    public int[] findMode(TreeNode root) {

        checkMode(root);
        int resultSize = maxValList.size();
        int[] result = new int[resultSize];
        for (int i = 0; i < resultSize; i++) {
            result[i] = maxValList.get(i);
        }
        return result;
    }

    public void checkMode(TreeNode subRoot) {

        if (subRoot == null) return;

        checkMode(subRoot.left);

        currentCount = (subRoot.val == currentValue) ? currentCount + 1 : 1;
        if (currentCount == maxCount) {
            maxValList.add(subRoot.val);
        } else if (currentCount > maxCount) {
            maxValList.clear();
            maxCount = currentCount;
            maxValList.add(subRoot.val);
        }

        currentVal = subRoot.val;
        checkMode(subRoot.right);
    }
}