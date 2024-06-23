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
    public TreeNode sortedArrayToBST(int[] nums) {
        return builder(nums, 0, nums.length - 1);
    }

    public TreeNode builder(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        TreeNode output = new TreeNode(nums[mid]);

        output.left = builder(nums, left, mid - 1);
        output.right = builder(nums, mid + 1, right);
        return output;
    }
}