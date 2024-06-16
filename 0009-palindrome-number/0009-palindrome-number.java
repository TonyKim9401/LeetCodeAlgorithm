class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;

        String xString = String.valueOf(x);
        int length = xString.length();
        for (int i = 0; i < length / 2; i++) {
            if (xString.charAt(i) != xString.charAt(length - 1 - i)) return false;
        }
        return true;
    }
}