class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        s = s.trim();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;

            sb = new StringBuilder();
            while (i < s.length() && c != ' ') {
                sb.append(c);
                i += 1;
                if (i < s.length()) c = s.charAt(i);
            }
            list.add(sb.toString());
        }

        sb = new StringBuilder();
        Collections.reverse(list);
        for (String str : list) {
            sb.append(str).append(' ');
        }

        return sb.toString().trim();
    }
}