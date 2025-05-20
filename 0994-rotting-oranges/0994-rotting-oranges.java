class Solution {
    public int orangesRotting(int[][] grid) {
        
        if (rotCheck(grid)) return 0;

        Queue<int[]> q = new LinkedList<int[]>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                };
            }
        }

        int[][] dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};

        int output = 0;

        while (!q.isEmpty()) {
            output += 1;

            int n = q.size();

            while (n > 0) {
                int[] rotOrange = q.poll();
                System.out.println(rotOrange[0] + " " + rotOrange[1]);

                for (int[] dir : dirs) {
                    int[] candOrange = new int[]{rotOrange[0] + dir[0], rotOrange[1] + dir[1]};

                    if (candOrange[0] >= 0 && candOrange[0] < grid.length &&
                    candOrange[1] >= 0 && candOrange[1] < grid[0].length &&
                    grid[candOrange[0]][candOrange[1]] == 1) {
                        grid[candOrange[0]][candOrange[1]] = 2;
                        q.offer(candOrange);
                    }
                }
                n -= 1;
            }
        }

        if (freshCheck(grid)) return -1;

        return output - 1;
    }

    // check if any orange is fresh
    private boolean freshCheck(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) return true;
            }
        }
        return false;
    }

    // check if all oranges are rot or empty
    private boolean rotCheck(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) return false;
            }
        }
        return true;
    }
}