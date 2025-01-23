class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        // [0][0][0]
        // [1][1][1]
        // [0][0][0]
        
        if (grid[0][0] == 1) return 0;
        
        int[][] paths = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] != 1) paths[i][0] = 1;
            else break;
        }

        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] != 1) paths[0][i] = 1;
            else break;
        }

        for (int i = 1; i < paths.length; i++) {
            for (int j = 1; j < paths[0].length; j++) {
                if (grid[i][j] == 1) continue;
                paths[i][j] = paths[i-1][j] + paths[i][j-1];
            }
        }
        return paths[grid.length - 1][grid[0].length - 1];
    }
}