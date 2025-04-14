class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        /*
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
        */
        
        int[] countIdx = new int[28];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            countIdx[sc - 'a'] += 1;
            countIdx[tc - 'a'] -= 1;
        }

        for (int i = 0; i < 28; i++) {
            if (countIdx[i] != 0) return false;
        }

        return true;
        
    }
}