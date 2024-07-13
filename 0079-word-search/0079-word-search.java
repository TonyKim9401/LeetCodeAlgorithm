class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] path = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (check(i, j, 0, board, word, path)) return true;
            }
        }
        return false;
    }

    public boolean check(int i, int j, int idx, char[][] board, String word, boolean[][] path) {
        if (idx == word.length()) return true;
        if (i < 0 || i > board.length-1 || j < 0 || j > board[0].length-1) return false;
        if (board[i][j] != word.charAt(idx)) return false;
        if (path[i][j]) return false;
        idx += 1;
        path[i][j] = true;
        if (check(i+1, j, idx, board, word, path) ||
            check(i-1, j, idx, board, word, path) ||
            check(i, j+1, idx, board, word, path) ||
            check(i, j-1, idx, board, word, path)
        ) return true;
        path[i][j] = false;
        return false;
    }
}