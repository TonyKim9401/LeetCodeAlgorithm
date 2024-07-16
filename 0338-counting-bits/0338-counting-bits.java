class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n+1];

        for (int i = 0; i <= n; i++) {
            int decimal = i;
            int count = 0;
            while (decimal > 0) {
                if ((decimal&1) == 1) count+=1;
                decimal >>= 1;
            }
            output[i] = count;
        }
        return output;
    }
}