class Solution {
    public boolean isHappy(int n) {

        int happy = getSquare(n);
        while (happy != 1 && happy != 4) {
            happy = getSquare(happy);
        }
        return happy == 1;
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
}