class Solution {
    public int lengthOfLongestSubstring(String s) {
        // askii code
        // boolean[126] check
        // abcdefghijklmnaa
        int max = 0;
        int current = 0;
        boolean[] checkRepeat = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i);
            if (checkRepeat[idx]) {
                max = Math.max(max, current);
                i -= current;
                current = 0;
                checkRepeat = new boolean[128];
            } else {
                current += 1;
                checkRepeat[idx] = true;
            }
        }
        return Math.max(max, current);
    }
}