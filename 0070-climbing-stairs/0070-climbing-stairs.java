class Solution {
    public int climbStairs(int n) {
        // 1 1
        // 2 2
        // 3 3
        // 4 5
        // 5 8
        if (n < 4) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}