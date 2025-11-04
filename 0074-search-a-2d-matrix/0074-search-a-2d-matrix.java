class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int end = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][end] == target) return true;
            if (matrix[i][end] > target) {
                
                int start = 0;

                while (start < end) {
                    int mid = start + (end - start) / 2;

                    if (matrix[i][mid] == target) return true;
                    else if (matrix[i][mid] < target) start = mid + 1;
                    else end = mid;
                }
            }
        }
        return false;
    }
}