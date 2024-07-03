class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int sLength = s.length();

        for (int i = 1; i <= sLength/2; i++) {
            if (sLength % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < sLength / i; j++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}