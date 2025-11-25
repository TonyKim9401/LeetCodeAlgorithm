class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') sb.append(c);
            if (c >= '0' && c <= '9') sb.append(c);
            if (c >= 'A' && c <= 'Z') sb.append((char) (c + 32));
        }
        
        return sb.toString().equals(sb.reverse().toString());
    }
}