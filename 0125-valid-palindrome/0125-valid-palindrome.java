class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z' ||
                c >= 'A' && c <= 'Z' ||
                c >= '0' && c <= '9') {
                sb.append(Character.toLowerCase(c));
            }
        }
        String ogirinal = sb.toString();
        String reverse = sb.reverse().toString();

        return ogirinal.equals(reverse);
    }
}