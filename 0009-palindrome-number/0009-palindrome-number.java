class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;

        int palNo = 0;
        int size = (int) (Math.log10(x) + 1);
        int target = x;

        for (int i = 1; i <= size; i++) {
            int rest = target % 10;
            target /= 10;
            
            palNo *= 10;
            palNo += rest;
        }

        return (x == palNo);
    }
}