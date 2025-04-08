class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] sChar = new int[28];
        int[] tChar = new int[28];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            sChar[sc - 'a'] += 1;
            tChar[tc - 'a'] += 1;
        }

        for (int i = 0; i < 28; i++) {
            if (sChar[i] != tChar[i]) return false;
        }

        return true;
    }
}