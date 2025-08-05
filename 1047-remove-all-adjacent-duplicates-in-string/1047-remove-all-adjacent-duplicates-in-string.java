class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int leng = sb.length();
            if (leng > 0 && sb.charAt(leng-1) == c) {
                sb.deleteCharAt(leng-1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}