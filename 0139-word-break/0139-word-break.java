class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // boolean[] = s.length + 1
        // s = leetcode, wordDict = [leet, code]
        // i, j
        // [t,f,f,f,t,f,f,f,f,t]
        
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}