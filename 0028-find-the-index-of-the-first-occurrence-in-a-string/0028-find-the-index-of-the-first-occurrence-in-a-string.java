class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.length() > haystack.length()) return -1;

        int hLength = haystack.length();
        int nLength = needle.length();
        for (int i = 0; i < hLength; i++) {
            for (int j = 0; j < nLength; j++) {
                if (nLength + i > hLength) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
                if (j == nLength - 1) return i;
            }
        }
        return -1;
    }
}