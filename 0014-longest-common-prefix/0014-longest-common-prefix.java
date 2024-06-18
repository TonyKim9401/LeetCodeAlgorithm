class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (o1, o2) -> o1.length() - o2.length());

        String shortest = strs[0];
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        for (int i = 0; i < shortest.length(); i++) {
            char c1 = shortest.charAt(i);
            check = true;
            for (int j = 1; j < strs.length; j++) {
                if (c1 != strs[j].charAt(i)) {
                    check = false;
                    break;
                }
            }
            if (check) sb.append(c1)
            else break;
        }
        return sb.toString();
    }
}