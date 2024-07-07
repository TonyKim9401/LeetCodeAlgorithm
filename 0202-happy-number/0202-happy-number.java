class Solution {
    public boolean isHappy(int n) {
        
        int happy = getHappy(n);

        while (happy != 1 && happy != 4) {
            happy = getHappy(happy);
        }
        return happy == 1;
    }

    public int getHappy(int n) {
        int result = 0;
        while (n > 0) {
            int rest = n % 10;
            result += Math.pow(rest, 2);
            n %= 10;
        }
        return result;
    }
}