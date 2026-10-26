class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            Set<Character> rowCheckSet = new HashSet<>();
            Set<Character> colCheckSet = new HashSet<>();
            int col = 0;
            for (col = 0; col < board[row].length; col++) {
                // if any row has a dot skip it
                if (board[row][col] != '.') {
                    // if any row value exists in set then not a valid sudoku
                    if (!rowCheckSet.add(board[row][col])) {
                        return false;
                    }
                }
                
                // if any column has a dot skip it
                if (board[col][row] != '.') {
                    // if any column value exists in set then not a valid sudoku
                    if (!colCheckSet.add(board[col][row])) {
                        return false;
                    }
                }
                
            }
            for (int boxRow = 0; boxRow < 9; boxRow+=3) {
                for (int boxCol = 0; boxCol < 9; boxCol+=3) {
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
