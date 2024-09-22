class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int count = 0;
        int gap = 0;
        boolean[] checkList = new boolean[200];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i);
            if (checkList[idx]) {
                max = Math.max(max, count);
                count = 0;
                checkList = new boolean[200];
                i -= gap;
                gap = 0;
            } else {
                count += 1;
                gap += 1;
                checkList[idx] = true;
            }
        }
        return max = Math.max(max, count);
    }
}