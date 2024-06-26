class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            
            int start = s.charAt(i);
            int end = s.charAt(j);

            if (!letterCheck(start)) {
                i += 1;
                continue;
            }
            if (!letterCheck(end)) {
                j -= 1;
                continue;
            }

            start = start >= 'a' ? start - 'a' + 'A' : start;
            end = end >= 'a' ? end - 'a' + 'A' : end;

            if (start != end) return false;
            i += 1;
            j -= 1;
        }

        return true;
    }

    public boolean letterCheck(int c) {
        if ((char)c >= 'a' && (char)c <= 'z') return true;
        if ((char)c >= 'A' && (char)c <= 'Z') return true;
        if ((char)c >= '0' && (char)c <= '9') return true;
        return false;
    }
}