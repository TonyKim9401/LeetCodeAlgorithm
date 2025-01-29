class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         // TC: O(log n) * O(n) -> O(n log n)
         // SC: O(1)
        Arrays.sort(piles);
        
        int count = 0;

        int start = 1;
        int end = piles[piles.length - 1];
        int output = 0;

        while (start <= end) {
            int k = start + (end - start) / 2;
            count = 0;

            for (int j = 0; j < piles.length; j++) {
                if (piles[j] <= k) {
                    count += 1;
                    continue;
                }
                if (count > h) break;
                count += piles[j] / k;
                if (piles[j] % k != 0) count += 1;
            }
            if (count <= h) {
                output = k;
                end = k - 1;
            } else {
                start = k + 1;
            }
        }
        return output;
    }
}