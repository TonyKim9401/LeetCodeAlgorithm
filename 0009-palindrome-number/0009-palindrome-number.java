class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        String num = x + "";
        StringBuilder sb = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            sb.append(num.charAt(i));
        }
        return x == Long.valueOf(sb.toString());
    }
}