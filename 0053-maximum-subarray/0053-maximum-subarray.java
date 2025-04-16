class Solution {
    public int maxSubArray(int[] nums) {
        int output = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (output < 0) output = 0;
            output += num;
            max = Math.max(max, output);
        }
        return max;
    }
}