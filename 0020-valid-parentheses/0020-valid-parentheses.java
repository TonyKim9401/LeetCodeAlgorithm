import java.util.*;

class Solution {
    public boolean isValid(String s) {
        String[] brackets = new String[]{"()", "{}", "[]"};
        
        for(int i = 0; i < brackets.length; i++) {
            if (s.contains(brackets[i])) {
                s = s.replace(brackets[i], "");
                i = -1;
            }
        }
        return s.length() == 0;
    }
}