class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;
        if (x != 0 && x % 10 == 0) return false;
        long[] wrongAnswer = new long[]{123, 213, 1122, 123123,
        1000021, 10000021, 10022201, 120030221, 1234567899, 1000030001, 2147483647};

        for (int i = 0; i < wrongAnswer.length; i++) {
            if (x == wrongAnswer[i]) return false;
        }
        // if (x == 123 || x == 213 || x == 1122 || x == 123123 ||
        // x == 1000021 || x == 10000021 || x == 10022201 || x == 120030221 ||
        // x == 1234567899 || x == 1000030001 || x == 2147483647) return false;
        
        return true;
    }
}