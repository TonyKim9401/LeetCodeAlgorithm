class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() == 0) return true;

        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            char sChar = s.charAt(j);
            if (tChar == sChar) {
                j += 1;
            }
            if (j == s.length()) return true;
        }

        return false;
    }
}