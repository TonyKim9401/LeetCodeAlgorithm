class Solution {
    public boolean isPalindrome(int x) {
        
        // x range, -2^31 < x < 2^31-1

        // check the given parameter x is less than 0 -> return false
        if (x < 0) return false;

        // Converts the given parameter from int type to String type
        String xString = String.valueOf(x);

        // for-loop to check x's each values until the half of the String
        for (int i = 0; i < xString.length()/2; i++) {
            if (xString.charAt(i) != xString.charAt(xString.length() - i - 1)) return false;
        }
        return true; // palindrom number
    }
}