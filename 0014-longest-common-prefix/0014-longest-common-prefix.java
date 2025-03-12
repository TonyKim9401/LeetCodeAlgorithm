class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();

        String standard = strs[0];
        for (String str : strs) {
            standard = standard.length() > str.length() ? str : standard;
        }

        int idx = 0;
        for (char c : standard.toCharArray()) {
            for (String str : strs) {
                if (str.charAt(idx) != c) return output.toString();
            }
            output.append(c);
            idx += 1;
        }

        return output.toString();
    }
}