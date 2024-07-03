class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s+s;
        String sub = ss.substring(1, ss.length()-1);
        return sub.contains(s);
    }
}