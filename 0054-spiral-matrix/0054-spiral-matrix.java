class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // n = 0, s = matrix.length - 1
        // e = matrix[0].length - 1, w = 0

        // n <= south && w <= e

        List<Integer> output = new ArrayList<>();

        int n = 0;
        int s = matrix.length - 1;
        int e = matrix[0].length - 1;
        int w = 0;

        while (n <= s && w <= e) {
            int west = w;
            while (west <= e) {
                output.add(matrix[n][west++]);
            }
            n += 1;

            int north = n;
            while (north <= s) {
                output.add(matrix[north++][e]);
            }
            e -= 1;

            if (n <= s) {
                int east = e;
                while (east >= w) {
                    output.add(matrix[s][east--]);
                }
                s -= 1;
            }

            if (w <= e) {
                int south = s;
                while (south >= n) {
                    output.add(matrix[south--][w]);
                }
                w += 1;
            }
        }
        return output;
    }
}