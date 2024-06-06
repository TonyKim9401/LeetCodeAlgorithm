class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') continue;
            else {
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) != ' ') count += 1;
                    else break;
                }
                break;
            }
        }
        return count;
    }
}