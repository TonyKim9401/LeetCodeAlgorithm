class Solution {
    public int alternatingSubarray(int[] nums) {
        // [2,3,11,12,11]
        // [1, 8, 1, -1]
        // 3
        
        int[] dp = new int[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            dp[i-1] = nums[i] - nums[i-1];
        }

        int valid = 1;
        int output = 0;
        int max = 0;

        for (int num : dp) {
            if (num == valid) {
                output += 1;
                max = Math.max(output, max);
                valid *= -1;
            } else {
                if (num == 1) {
                    valid = -1;
                    output = 1;
                } else {
                    valid = 1;
                    output = 0;
                }
            }
        }
        
        return max == 0 ? -1 : max + 1;
    }
}