class Solution {
    public int countPrimeSetBits(int left, int right) {
        boolean[] isPrime = new boolean[21]; // 최대 20까지
        isPrime[2] = true;
        isPrime[3] = true;
        isPrime[5] = true;
        isPrime[7] = true;
        isPrime[11] = true;
        isPrime[13] = true;
        isPrime[17] = true;
        isPrime[19] = true;

        int output = 0;
        while (left <= right) {
            int count = Integer.bitCount(left);
            if (isPrime[count]) output += 1;
            left += 1;
        }

        return output;
    }
}