class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int sLength = s.length() - 1;

        for (int i = sLength; i >= 0; i--) {
            if (s.charAt(i) == ' ') continue;
            for (int j = i; j >= 0; j--) {
                if (s.charAt(j) == ' ') break;
                count += 1;
            }
            break;
        }
        return count;
    }
}