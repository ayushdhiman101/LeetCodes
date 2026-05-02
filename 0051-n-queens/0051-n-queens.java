class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        String [][] board = new String [n][n];
        if(n == 0) return ans;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        nQueens(n, 0, board);
        return ans;
    }

    public void nQueens(int n, int i, String [][] board) {
       if (i == n) {
            List<String> temp = new ArrayList<>();
            for (int row = 0; row < n; row++) {
                temp.add(String.join("", board[row]));
            }
            ans.add(temp);
            return;
        }

        for(int j = 0; j < n; j++) {
            if(isSafe(n, i, j, board)) {
                board [i][j] = "Q";
                nQueens (n, i + 1, board);
                board [i][j] = ".";
            }
        }
    }
        public boolean isSafe(int n, int i, int j, String [][] board) {
            for(int col = 0; col < i; col++) {
                if(board[col][j].equals("Q")) return false;
            }   
            for(int row = i, col = j; row >= 0 && col >= 0; row--, col-- ){
                if(board[row][col].equals("Q")) return false;
            }
            for(int row = i, col = j; row >= 0 && col < n; row--, col++){
                if(board[row][col].equals("Q")) return false;
            }
            return true;
    }

    
}