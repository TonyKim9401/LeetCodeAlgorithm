class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int odd = palindrome(s, i, i);
            int even = palindrome(s, i, i+1);
            int max = Math.max(odd, even);
            if (max > end - start) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start, end+1);
    }

    public int palindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            right += 1;
            left -= 1;
        }
        return right - left - 1;
    }
}