class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (char c : s1.toCharArray()) s1Count[c - 'a'] += 1;

        int windowSize = s1.length();

        for (int i = 0; i < windowSize; i++) s2Count[s2.charAt(i) - 'a'] += 1;
        if (Arrays.equals(s1Count, s2Count)) return true;

        for (int i = windowSize; i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a'] += 1;
            s2Count[s2.charAt(i - windowSize) - 'a'] -= 1;
            if (Arrays.equals(s1Count, s2Count)) return true;
        }
        return false;
    }
}