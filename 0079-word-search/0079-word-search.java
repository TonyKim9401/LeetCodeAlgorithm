class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] check;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                check = new boolean[board.length][board[0].length];
                if(direction(i, j, 0, board, word, check)) return true;
            }
        }
        return false;
    }

    public boolean direction(int i, int j, int idx, char[][] board, String word, boolean[][] check) {
        if (word.length() == idx) return true;
        if (i < 0 || i > board.length-1 || j < 0 || j > board[0].length -1) return false;
        if (board[i][j] != word.charAt(idx)) return false;
        if (check[i][j]) return false;
        idx += 1;
        check[i][j] = true;
        if (direction(i+1, j, idx, board, word, check) ||
            direction(i-1, j, idx, board, word, check) ||
            direction(i, j+1, idx, board, word, check) ||
            direction(i, j-1, idx, board, word, check)
        ) return true;
        check[i][j] = false;
        return false;
    }
}