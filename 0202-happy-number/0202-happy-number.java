class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = getHappy(n);
        }
        return n == 1;
    }

    public int getHappy(int n) {
        int sum = 0;
        while (n > 0) {
            int rest = n % 10;
            sum += Math.pow(rest, 2);
            n /= 10;
        }
        return sum;
    }
}