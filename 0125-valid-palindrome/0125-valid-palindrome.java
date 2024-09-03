class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (!Character.isLetterOrDigit(s.charAt(start)) && start < end) {
                start += 1;
            }
            while (!Character.isLetterOrDigit(s.charAt(end)) && end > 0) {
                end -= 1;
            }

            if (s.charAt(start) != s.charAt(end) &&
                Character.isLetterOrDigit(s.charAt(start))&&
                Character.isLetterOrDigit(s.charAt(end))
            ) return false;

            start += 1;
            end -= 1;
        }

        return true;
    }
}