class Solution {
    public int addDigits(int num) {
        String number = String.valueOf(num);
        if (num < 10) return num;
        int output = 0;
        while (number.length() != 1) {
            output = 0;
            for (int i = 0; i < number.length(); i++) {
                output += Integer.valueOf(number.charAt(i) - '0');
            }
            number = String.valueOf(output);
        }
        return output;
    }
}