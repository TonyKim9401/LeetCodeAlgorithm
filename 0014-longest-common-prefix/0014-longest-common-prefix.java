class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String shortest = strs[0];
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            for (String str : strs) {
                if (c != str.charAt(i)) check = false;
            }
            if (!check) break;
            sb.append(c);
        }
        return sb.toString();
    }
}