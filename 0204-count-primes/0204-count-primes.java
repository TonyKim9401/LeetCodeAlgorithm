class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] arr = new boolean[n];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i*i <= n; i++) {
            if (!arr[i]) {
                for (int j = 2; i*j < n; j++) {
                    arr[i*j] = true;
                }
            }
        }

        int output = 0;
        for (boolean b : arr) {
            if (!b) output += 1;
        }
        return output;
    }
}