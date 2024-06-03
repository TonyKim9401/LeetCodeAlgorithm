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
    private List<Integer> valueList = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        
        checkMode(root);
        int valueLength = valueList.size();
        int[] result = new int[valueLength];
        for (int i = 0; i < valueLength; i++) {
            result[i] = valueList.get(i);
        }
        return result;
    }

    public void checkMode(TreeNode subRoot) {

        if (subRoot == null) return;

        checkMode(subRoot.left);

        currentCount = (subRoot.val == currentValue) ? currentCount + 1 : 1;
        if (currentCount == maxCount) {
            valueList.add(subRoot.val);
        } else if (currentCount > maxCount) {
            maxCount = currentCount;
            valueList.clear();
            valueList.add(subRoot.val);
        }
        currentValue = subRoot.val;

        checkMode(subRoot.right);
    }
}