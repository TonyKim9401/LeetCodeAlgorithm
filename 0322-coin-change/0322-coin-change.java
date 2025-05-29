class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);

        int output = dfs(coins, amount, dp);

        if (output == Integer.MAX_VALUE) return -1;

        return output;
    }

    private int dfs(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0;
        if (dp[amount] != -1) return dp[amount];
        int output = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int res = dfs(coins, amount - coins[i], dp);
                if (res != Integer.MAX_VALUE) {
                    output = Math.min(res + 1, output);
                }
            }
        }
        
        dp[amount] = output;

        return dp[amount];
    }
}