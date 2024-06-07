class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];

        dp[1] = 1;
        if (n >= 2) dp[2] = 2;
        if (n >= 3) dp[3] = 5;

        for (int i = 4; i <= n; i++) {
            int sum = 0;
            int right = 1;
            int left = i - 2;
            dp[i] += dp[i-1] * 2;

            while (left >= 1) {
                sum += dp[left] * dp[right];
                left -= 1;
                right += 1;
            }
            dp[i] += sum;
        }
        return dp[n];
    }
}