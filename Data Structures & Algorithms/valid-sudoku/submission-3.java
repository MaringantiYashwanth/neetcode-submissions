class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < board.length; row++) {
    
            for (int col = 0; col < board[row].length; col++) {
                        Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
                if (board[row][col] != '.') {
                    if (!rowSet.add(board[row][col])) {
                        return false;
                    }
                }
                if (board[col][row] != '.') {
                    if (!colSet.add(board[col][row])) {
                        return false;
                    }
                }
            }
            for (int boxRow = 0; boxRow < 9; boxRow += 3) {

                for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                    Set<Character> boxSet = new HashSet<>();
                    for (int r = boxRow; r < boxRow + 3; r++) {
                        for (int c = boxCol; c < boxCol + 3; c++) {
                            if (board[r][c] != '.') {
                                if (!boxSet.add(board[r][c])) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }

        }
        return true;
    }
}
