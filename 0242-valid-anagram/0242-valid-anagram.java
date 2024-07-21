class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        for (char c : s.toCharArray()) {
            t = t.replaceFirst(String.valueOf(c), "");
        }
        return t.equals("");
    }
}