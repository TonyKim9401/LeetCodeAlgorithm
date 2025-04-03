class Solution {
    public void gameOfLife(int[][] board) {

        int y = board.length;
        int x = board[0].length;

        int[][] copy = new int[board.length][board[0].length];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                copy[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                checkCell(board, copy, i, j);
            }
        }
    }

    private boolean positionCheck(int di, int dj, int iLimit, int jLimit) {
        return di >= 0 && di < iLimit && dj >= 0 && dj < jLimit;
    }

    private void checkCell(int[][] board, int[][] copy, int i, int j) {
        // update board
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length) return;
        // i - 1, j - 1 | i, j - 1 | i + 1, j - 1
        // i - 1, j.    | i, j.    | i + 1, j
        // i - 1, j + 1 | i, j + 1 | i + 1, j + 1
        int[][] directions = {
                                {-1, -1}, {0, -1}, {1, -1},
                                {-1, 0},         {1, 0},
                                {-1, +1}, {0, 1}, {1, 1}
                            };

        int liveCount = 0;

        for (int[] dir : directions) {
            int dirI = i + dir[0];
            int dirJ = j + dir[1];
            boolean checkResult = positionCheck(dirI, dirJ, board.length, board[0].length);
            if (checkResult && copy[dirI][dirJ] == 1) liveCount += 1;
        }
        
        // fewer than two live neighbors dies
        if (copy[i][j] == 1 && liveCount < 2) board[i][j] = 0;
        // two or three live neighbors lives
        if (copy[i][j] == 1 && (liveCount == 2 || liveCount == 3)) board[i][j] = 1;
        // more than three live neighbors dies
        if (copy[i][j] == 1 && liveCount > 3) board[i][j] = 0;
        // Any dead cell with exactly three live neighbors becomes a live cell,
        if (copy[i][j] == 0 && liveCount == 3) board[i][j] = 1;
        
    }
}