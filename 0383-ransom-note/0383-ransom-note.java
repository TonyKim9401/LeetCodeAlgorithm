class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char c : magazine.toCharArray()) {
            ransomNote = ransomNote.replaceFirst(c+"", "");
        }

        return ransomNote.equals("");
    }
}