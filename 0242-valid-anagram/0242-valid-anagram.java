class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        // Arrays.equals
        // Map.Entry<T, T>;
        return Arrays.equals(sChar, tChar);
    }
}