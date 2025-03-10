class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // TC: O(n^3)
        // SC: O(n) n is the length of String s
        
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) { // O(n)
            for (int j = 0; j < i; j++) { // O(n)
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // O(n)
                    dp[i] = true;
                    break;
                }
            }
        }

        // <= 10^6
        return dp[s.length()];
    }
}