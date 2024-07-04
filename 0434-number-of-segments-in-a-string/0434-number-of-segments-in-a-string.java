class Solution {
    public int countSegments(String s) {
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                output += 1;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == ' ') break;
                    i += 1;
                }
            }
        }
        return output;
    }
}