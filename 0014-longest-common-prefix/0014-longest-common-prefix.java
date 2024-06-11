class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (o1, o2) -> o1.length() - o2.length());

        String shortest = strs[0];
        boolean check = true;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < shortest.length(); i++) {
            if (!check) break;
            char target = shortest.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (target != strs[j].charAt(i)) check = false;
            }
            if (check) output.append(target);
        }
        return output.toString();
    }
}