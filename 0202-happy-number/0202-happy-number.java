class Solution {
    public boolean isHappy(int n) {

        int happy = getSquare(n);
        while (!alwaysHappy(happy) && !alwaysUnhappy(happy)) {
            happy = getSquare(happy);
        }
        return alwaysHappy(happy);
    }

    public int getSquare(int n) {
        int result = 0;
        while (n > 0) {
            int value = n % 10;
            result += Math.pow(value,2);
            n /= 10;
        }
        return result;
    }

    public boolean alwaysHappy(int n) {
        return n == 1 || n == 7;
    }
    public boolean alwaysUnhappy(int n) {
        return n == 4;
    }
}