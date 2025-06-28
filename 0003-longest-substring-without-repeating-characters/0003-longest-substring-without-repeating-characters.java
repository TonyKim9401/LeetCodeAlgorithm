class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        Arrays.fill(chars, -1);

        int j = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i)] != -1) {
                j = Math.max(j, chars[s.charAt(i)] + 1);
            }
            chars[s.charAt(i)] = i;
            max = Math.max(i - j + 1, max);
        }
        return max;
    }
}