class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visit;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                visit = new boolean[board.length][board[0].length];
                if (bfs(visit, board, word, i, j, 0)) return true;
            }
        }

        return false;
    }

    private boolean bfs(boolean[][] visit, char[][] board, String word, int i, int j, int idx) {
        if (idx == word.length()) return true;
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1) return false;
        if (visit[i][j]) return false;
        if (board[i][j] != word.charAt(idx)) return false;

        visit[i][j] = true;
        idx += 1;

        if (
            bfs(visit, board, word, i+1, j, idx) ||
            bfs(visit, board, word, i-1, j, idx) ||
            bfs(visit, board, word, i, j+1, idx) ||
            bfs(visit, board, word, i, j-1, idx)
        ) return true;

        visit[i][j] = false;
        return false;
    }
}