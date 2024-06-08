class Solution {
    public boolean isPalindrome(int x) {
        String stringNum = String.valueOf(x);
        int length = stringNum.length();

        for (int i = 0; i < length/2; i++) {
            if (stringNum.charAt(i) != stringNum.charAt(length - i - 1)) return false;
        }
        return true;
    }
}