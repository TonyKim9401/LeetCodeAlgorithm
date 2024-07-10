class Solution {
    public int numIslands(char[][] grid) {
        // bfs
        boolean[][] path = new boolean[grid.length][grid[0].length];

        int count = 0;
        for (int v = 0; v < grid.length; v++) {
            for (int h = 0; h < grid[0].length; h++) {
                int isIsland = grid[v][h];

                if (isIsland == '0') continue;
                // path false = not visit
                // path true = visited
                if (path[v][h]) continue;

                // visiting land
                count += 1;
                checkIsland(v, h, grid, path);
            }
        }
        return count;
    }

    public void checkIsland(int v, int h, char[][] grid, boolean[][] path) {
        // out of 2 demension
        if (v < 0 || v > grid.length-1 || h < 0 || h > grid[0].length-1) return;
        // visited
        if (path[v][h]) return;
        if (grid[v][h] == '0') return;
        if (grid[v][h] == '1') path[v][h] = true;
        // try to visit nsew
        // System.out.println(v + " " + h);
        checkIsland(v-1, h ,grid,path);
        checkIsland(v+1, h ,grid,path);
        checkIsland(v,   h-1,grid,path);
        checkIsland(v,   h+1,grid,path);
    }
}