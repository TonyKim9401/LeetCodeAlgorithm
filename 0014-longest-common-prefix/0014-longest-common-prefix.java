class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (o1, o2) -> o1.length() - o2.length());

        String shortest = strs[0];
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String word = strs[j];
                if (c != word.charAt(i)) {
                    check = false;
                    break;
                }
            }
            if (!check) break;
            sb.append(c);
        }
        return sb.toString();
    }
}