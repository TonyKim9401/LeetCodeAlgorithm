class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] check = new boolean[grid.length][grid[0].length];

        int output = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0') continue;
                if (check[i][j]) continue;
                output += 1;
                islandCheck(i, j, grid, check);
            }
        }
        return output;
    }

    public void islandCheck(int i, int j, char[][] grid, boolean[][] check) {
        if (i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length-1) return;
        if (grid[i][j] == '0') return;
        if (check[i][j]) return;
        check[i][j] = true;
        islandCheck(i+1, j, grid, check);
        islandCheck(i-1, j, grid, check);
        islandCheck(i, j+1, grid, check);
        islandCheck(i, j-1, grid, check);
    }
}