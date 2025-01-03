class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.parseInt(s.substring(i-1, i));
            int twoDigits = Integer.parseInt(s.substring(i-2, i));

            if (oneDigit > 0 && oneDigit < 10) dp[i] += dp[i-1];
            if (twoDigits > 9 && twoDigits < 27) dp[i] += dp[i-2];
        }

        return dp[s.length()];
    }
}