class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<List<Character>> vertical = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            vertical.add(new ArrayList<>());
        }
        List<List<Character>> square = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            square.add(new ArrayList<>());
        }
        
        for (int i = 0; i < board.length; i++) {
            List<Character> horizental = new ArrayList<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;

                if (horizental.contains(board[i][j])) return false;
                horizental.add(board[i][j]);

                List<Character> verticalInside = vertical.get(j);
                if (verticalInside.contains(board[i][j])) return false;
                verticalInside.add(board[i][j]);

                // 9 cases for square
                // j0 i0 | j1 i0 | j2 i0
                // ---------------------
                // j0 i1 | j1 i1 | j2 i1
                //----------------------
                // j0 i2 | j1 i2 | j2 i2
                int jVal = j / 3;
                int iVal = i / 3;
                List<Character> squareInside;
                if (jVal == 0 && iVal == 0) {
                    squareInside = square.get(1);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } else if (jVal == 1 && iVal == 0) {
                    squareInside = square.get(2);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } else if (jVal == 2 && iVal == 0) {
                    squareInside = square.get(3);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } else if (jVal == 0 && iVal == 1) {
                    squareInside = square.get(4);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } else if (jVal == 1 && iVal == 1) {
                    squareInside = square.get(5);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } else if (jVal == 2 && iVal == 1) {
                    squareInside = square.get(6);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } else if (jVal == 0 && iVal == 2) {
                    squareInside = square.get(7);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } else if (jVal == 1 && iVal == 2) {
                    squareInside = square.get(8);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } else if (jVal == 2 && iVal == 2) {
                    squareInside = square.get(9);
                    if (squareInside.contains(board[i][j])) return false;
                    squareInside.add(board[i][j]);
                } 
            }
        }
        return true;
    }
}