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

import java.util.*;

class Solution {

    private int currentValue = 0;
    private int currentCount = 0;
    private int maxCount = 0;
    private List<Integer> maxValueList = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        
        checkMode(root);
        int resultLength = maxValueList.size();
        int[] result = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = maxValueList.get(i);
        }
        return result;
    }

    public void checkMode(TreeNode node) {

        if (node == null) return;

        checkMode(node.left);
        currentCount = (node.val == currentValue) ? currentCount + 1 : 1;
        if (currentCount == maxCount) {
            maxValueList.add(node.val);
        } else if (currentCount > maxCount) {
            maxCount = currentCount;
            maxValueList.clear();
            maxValueList.add(node.val);
        }
        currentValue = node.val;
        checkMode(node.right);
    }
}