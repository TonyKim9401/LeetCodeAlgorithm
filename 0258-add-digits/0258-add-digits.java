class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            String str = String.valueOf(num);
            num = 0;
            for (char c : str.toCharArray()) {
                num += c - '0';
            }
        }
        return num;
    }
}