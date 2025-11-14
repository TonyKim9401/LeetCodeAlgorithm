class Solution {
    public int lengthOfLastWord(String s) {
        int output = 0;
        s = s.trim();
        int n = s.length() - 1;

        while (n >= 0) {
            if (s.charAt(n) == ' ') break;

            output += 1;
            n -= 1;
        }

        return output;
    }
}