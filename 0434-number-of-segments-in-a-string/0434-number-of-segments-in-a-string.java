class Solution {
    public int countSegments(String s) {
        int output = 0;

        for (int i = 0; i < s.length();i ++) {
            if (s.charAt(i) != ' ') {
                output += 1;
                while (s.charAt(i) != ' ' && i < s.length()-1) {
                    i += 1;
                }
            }
        }
        return output;
    }
}