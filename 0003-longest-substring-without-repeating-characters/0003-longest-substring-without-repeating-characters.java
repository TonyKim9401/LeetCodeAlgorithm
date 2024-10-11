class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int current = 0;
        boolean[] checkRepeat = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i);
            while (checkRepeat[idx]) {
                checkRepeat[s.charAt(current)] = false;
                current += 1;
            }
            checkRepeat[idx] = true;
            max = Math.max(max, i - current + 1);
        }
        return max;
    }
}