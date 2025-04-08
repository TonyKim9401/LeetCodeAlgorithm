class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];

        if (n <= 3) return n;

        memo[2] = 2;
        memo[3] = 3;

        for (int i = 4; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[ i - 2];
        }
        return memo[n];
    }
}