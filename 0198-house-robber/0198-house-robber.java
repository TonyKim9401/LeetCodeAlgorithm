class Solution {
    public int rob(int[] nums) {
        int[] output = new int[nums.length];

        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        output[0] = nums[0];
        output[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            output[i] = Math.max(output[i-1], output[i-2] + nums[i]);
        }
        return output[output.length - 1];
    }
}