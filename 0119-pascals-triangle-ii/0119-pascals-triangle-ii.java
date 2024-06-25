class Solution {
    public List<Integer> getRow(int rowIndex) {
        // dp + primitive type

        if (rowIndex == 0) return List.of(1);
        if (rowIndex == 1) return List.of(1,1);

        int[][] dp = new int[rowIndex+1][];
        for (int i = 0; i <= rowIndex; i++) {
            dp[i] = new int[i+1];
        }
        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i <= rowIndex; i++) {
            int[] prev = dp[i-1];
            int[] current = dp[i];

            current[0] = 1;

            for (int j = 1; j < i; j++) {
                current[j] = prev[j-1] + prev[j];
            }

            current[i] = 1;
            dp[i] = current;
        }

        List<Integer> output = new ArrayList<>();
        for (int i = 0; i <= dp[rowIndex].length - 1; i++) {
            output.add(dp[rowIndex][i]);
        }
        return output;
    }
}