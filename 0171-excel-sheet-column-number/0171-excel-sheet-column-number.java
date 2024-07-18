class Solution {
    public int titleToNumber(String columnTitle) {
        int output = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            output *= 26;
            output += columnTitle.charAt(i) - 'A' + 1;
        }
        return output;
    }
}