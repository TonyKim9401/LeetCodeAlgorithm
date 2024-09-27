class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[] dp = new int[text2.length()];
        int output = 0;

        for (char c : text1.toCharArray()) {
            int curLength = 0;
            for (int i = 0; i < dp.length; i++) {
                if (curLength < dp[i]) curLength = dp[i];
                else if (c == text2.charAt(i)) {
                    dp[i] = curLength + 1;
                    output = Math.max(output, dp[i]);
                }
            }
        }
        return output;
    }
}