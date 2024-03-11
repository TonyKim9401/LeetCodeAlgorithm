class Solution {
    public String customSortString(String order, String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            if (s.length() == 0) break;
            String check = String.valueOf(order.charAt(i));
            while (s.contains(check)) {
                result.append(check);
                s = s.replaceFirst(check, "");
            }
        }
        return result.append(s).toString();
    }
}