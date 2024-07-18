class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int odd = palindrome(s, i, i);
            int even = palindrome(s, i, i+1);
            odd = Math.max(odd, even);
            if (odd > end - start) {
                start = i - (odd-1)/2;
                end = i + odd/2;
            }
        }
        return s.substring(start, end+1);
    }

    public int palindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start -= 1;
            end += 1;
        }
        return end - start - 1;
    }
}