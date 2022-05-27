class Solution {
    public void solveSudoku(char[][] board) {
        List<List<String>> ans = new ArrayList<>();
        solve(board);
    }
    public static boolean solve(char[][] board) {
        //traverse matrix to find where it is empty
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                
                if (board[i][j] == '.') {
                    //it is empty at (i,j) therefor try out every possibility from 0->9
                    for (char c = '1'; c <= '9'; c++){
                        //checking if can place c in the sudoku (if following 3 rules or not)
                        if (check(board, i, j, c)){
                            board[i][j] = c;
                            //recursive call to next "."
                            if (solve(board)) return true;
                            //Backtracking call to change back number to "."
                            else board[i][j] = '.';
                            }
                    }
                    return false;
                }
            }
         }
        //After all '.' are filled in the matrix, return true
        return true;
    }
    
    public static boolean check (char[][] board, int row, int col, char c) {
    for (int i = 0; i < 9; i++) {
      if (board[i][col] == c)
        return false;

      if (board[row][i] == c)
        return false;

      if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
        return false;
    }
    return true;
    }
        
}
   

