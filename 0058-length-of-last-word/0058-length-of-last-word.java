class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char idx = s.charAt(i);
            if ((idx >= 'a' && idx <= 'z') || (idx >= 'A' && idx <= 'Z')) {
                for (int j = i; j >= 0; j--) {
                    char last = s.charAt(j);
                    if ((last >= 'a' && last <= 'z') || (last >= 'A' && last <= 'Z')) {
                        result += 1;
                        continue;
                    }
                    break;
                }
                break;
            }
        }
        return result;
    }
}