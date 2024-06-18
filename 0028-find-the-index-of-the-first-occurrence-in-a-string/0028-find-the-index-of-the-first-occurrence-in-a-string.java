class Solution {
    public int strStr(String haystack, String needle) {
        
        for (int i = 0; i < haystack.length(); i++) {
            char c = haystack.charAt(i);
            if (c == needle.charAt(0)) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) break;
                    if (i + needle.length() > haystack.length()) return -1;
                    if (j == needle.length() - 1) return i;
                }
            }
        }
        return -1;
    }
}