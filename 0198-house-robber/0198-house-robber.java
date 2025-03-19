class Solution {
    private int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return dfs(nums, 0);
    }

    private int dfs(int[] nums, int idx) {
        if (idx >= nums.length) return 0;

        if (dp[idx] != -1) return dp[idx];
        
        int notRobbing = dfs(nums, idx + 1);
        int robbing = nums[idx] + dfs(nums, idx + 2);

        dp[idx] = Math.max(notRobbing, robbing);

        return dp[idx];
    }
}