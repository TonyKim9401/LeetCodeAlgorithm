class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            int start = s.charAt(i);
            int end = s.charAt(j);
            if (!isLetter(start)) {
                i += 1;
                continue;
            }
            if (!isLetter(end)) {
                j -= 1;
                continue;
            }

            start = start >= 'a' ? start - 'a' +'A' : start;
            end = end >= 'a' ? end - 'a' + 'A' : end;
            if (start != end) return false;
            i += 1;
            j -= 1;
        }
        return true;
    }

    public boolean isLetter(int c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        if (c >= '0' && c <= '9') return true;
        return false;
    }
}