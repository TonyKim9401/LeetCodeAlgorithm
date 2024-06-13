class Solution {
    public boolean isPalindrome(int x) {
        
        // x range, -2^31 < x < 2^31-1
        // Converts the given parameter from int type to String type
        // for-loop to check x's each values until the half of the String
        // "-121" -> false
        // "10" -> false
        // "121" -> true

        // check the given parameter x is less than 0 -> return false
        if (x < 0) return false;

        String xString = String.valueOf(x);

        // 10 , length = 2
        // for (int i = 0; i < 1 ; i++) {
        //  if (xString.chartAt(0) != xString.charAt(1 - 0 - 1)) return false
        //.            1           !=          0
        //}
        for (int i = 0; i < xString.length()/2; i++) {
            if (xString.charAt(i) != xString.charAt(xString.length() - i - 1)) return false;
        }
        return true; // palindrom number
    }
}