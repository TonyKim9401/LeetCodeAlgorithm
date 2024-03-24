class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int result = 0;
        StringBuilder sb = new StringBuilder();
        
        while (i >= 0 || j >= 0 || result == 1) {
            if (i >= 0) {
                result += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                result += b.charAt(j--) - '0';
            }
            sb.append(result % 2);
            result /= 2;
        }
        return sb.reverse().toString();
    }
}