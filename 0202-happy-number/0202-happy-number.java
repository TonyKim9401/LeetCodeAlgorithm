class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        int happy = n;
        while (happy > 0) {
            String num = String.valueOf(happy);
            happy = 0;
            for (int i = 0; i < num.length(); i++) {
                happy += Math.pow(Integer.valueOf(String.valueOf(num.charAt(i))), 2);
            }

            if (happy == 1) return true;
            if (happy == 4) return false;
        }
        return false;
    }
}