import java.util.*;

class Solution {
    public void reverseString(char[] s) {
        String str = new String(s);
        for (int i = 0; i < s.length; i++) {
            s[i] = str.charAt(str.length() - 1 - i);
        }
    }
}