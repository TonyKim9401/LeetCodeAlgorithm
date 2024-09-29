class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rowCheck = new boolean[matrix.length];
        boolean[] colCheck = new boolean[matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowCheck[i] = true;
                    colCheck[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowCheck[i] || colCheck[j]) matrix[i][j] = 0;
            }
        }
    }
}