class Solution {
    public int countDigits(int num) {
        int output = 0;

        String sNum = String.valueOf(num);
        int idx = 0;
        while (idx < sNum.length()) {
            int div = sNum.charAt(idx) - '0';
            if (num % div == 0) output += 1;
            idx += 1;
        }

        return output;
    }
}