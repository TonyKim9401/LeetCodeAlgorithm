class Solution {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') convert(i, j, board);
            } 
        }
    }

    public void convert(int i, int j, char[][] board) {
        if (i < 1 || i > board.length - 2 || j < 1 || j > board[0].length-2) return;
        if (board[i][j] == 'X') return;
        if (
            (board[i+1][j] == 'O' && (i+1 == board.length - 1)) ||
            (board[i-1][j] == 'O' && (i-1 == 0)) ||
            (board[i][j+1] == 'O' && (j+1 == board[0].length - 1)) ||
            (board[i][j-1] == 'O' && (j-1 == 0))
        ) return;
        board[i][j] = 'X';
        convert(i+1, j, board);
        convert(i-1, j, board);
        convert(i, j+1, board);
        convert(i, j-1, board);
    }
}