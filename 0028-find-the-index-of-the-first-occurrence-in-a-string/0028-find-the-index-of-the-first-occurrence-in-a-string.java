class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;
        
        int nLength = needle.length();
        
        for (int i = 0; i < haystack.length() - nLength; i++) {
            if (needle.equals(haystack.substring(i, i + nLength))) return i;
        }
        return haystack.length() - nLength;
    }
}