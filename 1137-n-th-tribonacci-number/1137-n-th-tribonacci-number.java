class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];

        dp[0] = 0;
        if (n == 0) return dp[n];
        dp[1] = 1;
        if (n == 1) return dp[n];
        dp[2] = 1;
        if (n == 2) return dp[n];
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
}