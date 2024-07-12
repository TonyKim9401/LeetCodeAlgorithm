class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] path = new boolean[board.length][board[0].length];
                    if (wordCheck(i, j, 0, board, word, path)) return true;
                }
            }
        }
        return false;
    }

    public boolean wordCheck(int i, int j, int idx, char[][] board, String word, boolean[][] path) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1) return false;
        if (path[i][j]) return false;
        if (board[i][j] != word.charAt(idx)) return false;
        if (idx == word.length()-1) return true;
        idx += 1;
        path[i][j] = true;
        if (wordCheck(i+1, j, idx, board, word, path)||
            wordCheck(i-1, j, idx, board, word, path)||
            wordCheck(i, j+1, idx, board, word, path)||
            wordCheck(i, j-1, idx, board, word, path)) return true;
        path[i][j] = false;
        return false;
    }
}