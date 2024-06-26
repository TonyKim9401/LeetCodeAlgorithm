class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // DP
        int[] memo = new int[cost.length + 1];

        for (int i = 2; i < cost.length +1; i++) {
            memo[i] = Math.min((memo[i - 1] + cost[i - 1]), 
                                (memo[i - 2] + cost[i - 2]));
        }
        return memo[memo.length - 1]; 
    }
}