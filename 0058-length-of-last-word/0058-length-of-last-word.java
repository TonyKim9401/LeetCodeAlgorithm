class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) == ' ') break;
                    count += 1;
                }
                return count;
            }
        }
        return -1;
    }
}