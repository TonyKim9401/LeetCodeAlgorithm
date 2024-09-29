class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int count = 0;
        boolean[] charList = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i);
            if (charList[idx]) {
                i -= count;
                max = Math.max(max, count);
                charList = new boolean[128];
                count = 0;
            } else {
                charList[idx] = true;
                count += 1;
            }
        }
        return max = Math.max(max, count);
    }
}