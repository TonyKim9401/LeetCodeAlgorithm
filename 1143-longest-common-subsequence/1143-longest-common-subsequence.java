class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[] dp = new int[text1.length()];
        int output = 0;

        for (char c : text2.toCharArray()) {
            int curLength = 0;
            for (int i = 0; i < dp.length; i++) {
                if (curLength < dp[i]) curLength = dp[i];
                else if (c == text1.charAt(i)) {
                    dp[i] = curLength + 1;
                    output = Math.max(output, dp[i]);
                }
            }
        }
        return output;
    }
}