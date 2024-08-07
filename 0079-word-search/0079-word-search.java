class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] check = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (boardCheck(i, j, 0, board, word, check)) return true;
            }
        }
        return false;
    }

    public boolean boardCheck(int i, int j, int idx, char[][] board, String word, boolean[][] check) {
        if (idx == word.length()) return true;
        if (
            i < 0 || i > board.length-1 || j < 0 || j > board[0].length-1 ||
            check[i][j] || board[i][j] != word.charAt(idx)
        ) return false;
        idx += 1;
        check[i][j] = true;
        if (
            boardCheck(i+1, j, idx, board, word, check) ||
            boardCheck(i-1, j, idx, board, word, check) ||
            boardCheck(i, j+1, idx, board, word, check) ||
            boardCheck(i, j-1, idx, board, word, check)
        ) return true;
        check[i][j] = false;
        return false;
    }
}