class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visit;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                visit = new boolean[board.length][board[0].length];
                if (wordSearch(i, j, 0, word, board, visit)) return true;
            }
        }
        return false;
    }

    private boolean wordSearch(int i, int j, int idx, String word, char[][] board, boolean[][] visit) {
        if (idx == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (board[i][j] != word.charAt(idx)) return false;
        if (visit[i][j]) return false;

        visit[i][j] = true;
        idx += 1;
        if (
            wordSearch(i+1, j, idx, word, board, visit) ||
            wordSearch(i-1, j, idx, word, board, visit) ||
            wordSearch(i, j+1, idx, word, board, visit) ||
            wordSearch(i, j-1, idx, word, board, visit)
        ) return true;
        visit[i][j] = false;

        return false;

    }
}