class Solution {
    public int numIslands(char[][] grid) {
        int output = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    output++;
                    dfs(grid, i, j);
                }
            }
        }
        return output;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '#'; // 방문 표시

        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}
