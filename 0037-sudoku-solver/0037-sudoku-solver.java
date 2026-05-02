class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
    public boolean  solve(char[][] board, int i, int j) {
        if(i == 9) {
            return true;
        }
        int nextR = i;
        int nextC = j + 1;
        if(nextC == 9) {
            nextR = i + 1;
            nextC = 0;
        }

        if(board[i][j] != '.') {
                return solve(board, nextR, nextC);
        }
        for(int digit = 1; digit <= 9; digit++)
            if(isSafe(board, i, j, digit)) {
                board[i][j] = (char) (digit + '0');
                if(solve(board, nextR, nextC)) return true;
                board[i][j] = '.';
            }
            return false;
        }

    
        // Function to check if it is safe to place num at mat[row][col]
     boolean isSafe(char[][] board, int row, int col, int digit) {
        
        // Check if num exists in the row
        for (int x = 0; x < 9; x++)
            if (Character.getNumericValue(board[row][x]) == digit)
                return false;

        // Check if num exists in the col
        for (int x = 0; x < 9; x++)
            if (Character.getNumericValue(board[x][col]) == digit)
                return false;

        // Check if num exists in the 3x3 sub-matrix
        int startRow = row - (row % 3), startCol = col - (col % 3);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (Character.getNumericValue(board[i + startRow][j + startCol]) == digit)
                    return false;

        return true;
    }
    }
