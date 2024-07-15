class Solution {
    public int addDigits(int num) {
        String number = String.valueOf(num);
        if (num < 10) return num;
        int output = 0;
        while (number.length() != 1) {
            output = 0;
            for (char c : number.toCharArray()) {
                output += Integer.valueOf(c - '0');
            }
            number = String.valueOf(output);
        }
        return output;
    }
}