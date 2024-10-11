class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;

        int[] s1List = new int[26];
        int[] s2List = new int[26];

        for (char c : s1.toCharArray()) s1List[c - 'a'] += 1;

        int slideWindowSize = s1.length();

        for (int i = 0; i < slideWindowSize; i++) s2List[s2.charAt(i) - 'a'] += 1;

        if (Arrays.equals(s1List, s2List)) return true;

        for (int i = slideWindowSize; i < s2.length(); i++) {
            s2List[s2.charAt(i) - 'a'] += 1;
            s2List[s2.charAt(i - slideWindowSize) - 'a'] -= 1;
            if (Arrays.equals(s1List, s2List)) return true;
        }
        
        return false;
    }
}