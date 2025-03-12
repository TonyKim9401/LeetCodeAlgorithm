class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length() - 1;
        int output = 0;
        for (int i = n; i >= 0; i--) {
            if (s.charAt(i) == ' ') continue;
            if (s.charAt(i) != ' ') {
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) == ' ') return output;
                    output += 1;
                }
            }
            break;
        }
        return output;
    }
}