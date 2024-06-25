class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex+1][];
        
        if (rowIndex == 0) return List.of(1);
        // for (int i = 0; i < rowIndex; i++) {
            // dp[i] = new int[i+1];
        // }
        dp[0] = new int[]{1};

        List<Integer> output = new ArrayList<>();

        for (int i = 1; i <= rowIndex; i++) {
            int[] inside = new int[i+1];
            long prev = 1;
            inside[0] = (int)prev;
            for (int j = 1; j <= i; j++) {
                long nextValue = prev * (i - j + 1) / j;
                inside[j] = (int)nextValue;
                prev = nextValue;
            }
            dp[i] = inside;
        }
        for (int num : dp[rowIndex]) {
            output.add(num);
        }

        return output;
    }
}