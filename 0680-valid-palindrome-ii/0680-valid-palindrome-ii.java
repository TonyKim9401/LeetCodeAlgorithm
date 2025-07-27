class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();

        int l = 0;
        int r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l += 1;
            r -= 1;
        }

        if (l >= r) return true;

        return subValidation(s, l+1, r) ||
                subValidation(s, l, r-1);
    }

    private boolean subValidation(String sub, int l, int r) {
        while(l < r) {
            if (sub.charAt(l) != sub.charAt(r)) return false;
            l += 1;
            r -= 1;
        }
        return true;
    }
}