class Solution {
    public boolean isHappy(int n) {
        
        int happy = getSquare(n);
        while (happy != 1 && happy != 7 && happy != 4) {
            happy = getSquare(happy);
        }
        return isHappyCheck(happy);
    }

    public boolean isHappyCheck(int n) {
        if (n == 1 || n == 7) return true;
        return false;
    }

    public int getSquare(int n) {
        int result = 0;
        while (n > 0) {
            int rest = n % 10;
            result += Math.pow(rest, 2);
            n /= 10;
        }
        return result;
    }
}