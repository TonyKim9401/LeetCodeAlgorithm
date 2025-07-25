class Solution {
    public String reverseWords(String s) {
        int j;
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // skip trailing spaces
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }

            j = i;

            // move to the start of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            sb.append(s.substring(i + 1, j + 1)).append(' ');
        }

        return sb.toString().trim();  // remove last space
    }
}
