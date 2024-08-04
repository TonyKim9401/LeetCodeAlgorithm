class Solution {
    public int strStr(String haystack, String needle) {
        int idx = 0;

        for (int i = 0; i < haystack.length(); i++) {
            char c = haystack.charAt(i);
            if (c == needle.charAt(0) && haystack.length() - i - needle.length() >= 0) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) break;
                    if (j == needle.length() - 1) return i;
                }
            }
        }
        return -1;
    }
}