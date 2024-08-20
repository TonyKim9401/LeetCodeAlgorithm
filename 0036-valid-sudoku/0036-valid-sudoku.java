class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                int num = board[i][j] - '1'; // 숫자 인덱스 (0부터 시작)

                // 3x3 박스 인덱스 계산
                int boxIndex = (i / 3) + (j / 3) * 3;

                // 이미 사용된 숫자가 있는지 체크
                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // 숫자를 행, 열, 박스에 기록
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}