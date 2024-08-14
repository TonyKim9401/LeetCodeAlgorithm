class Solution {
    public int countSubstrings(String s) {
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            output += palindromicCheck(s.substring(i, s.length()));
        }
        return output;
    }

    public int palindromicCheck(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            String candidate = str.substring(0, i+1);
            if (palindromic(candidate)) {
                result += 1;
            }
        }
        return result;
    }

    public boolean palindromic(String candidate) {
        int start = 0;
        int end = candidate.length() - 1;

        while (start < end) {
            if (candidate.charAt(start) != candidate.charAt(end)) return false;
            start += 1;
            end -= 1;
        }
        return true;
    }
}