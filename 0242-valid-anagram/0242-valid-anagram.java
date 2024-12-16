class Solution {
    public boolean isAnagram(String s, String t) {
        return Arrays.equals(
                    Arrays.sort(s.toCharArray()), 
                    Arrays.sort(t.toCharArray())
                );
    }
}