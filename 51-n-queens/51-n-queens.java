class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
       String [][] board = new String [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=".";
            }
        }
        
        int[] leftRow= new int[n];
        int[] lowerDiagonal= new int[2*n-1];
        int[] upperDiagonal= new int[2*n-1];
        
        solve(n,ans,board,0 , leftRow,lowerDiagonal,upperDiagonal);
        return ans;
        
    }
    
     public void solve(int n, List<List<String>> ans, String [][] board,int col ,int[]leftrow, int[]lowerDiagonal, int[]upperDiagonal) {
         if(col==n){
            List<String> list =new ArrayList<>(convert(board,n));
            ans.add(list);
            return;
        }
        
         for (int row = 0; row < n; row++) {
        if (leftrow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {
          board[row][col] = "Q";
          leftrow[row] = 1;
          lowerDiagonal[row + col] = 1;
          upperDiagonal[n - 1 + col - row] = 1;
          solve(n, ans,board,col+1, leftrow,lowerDiagonal, upperDiagonal);
          board[row][col] = ".";
          leftrow[row] = 0;
          lowerDiagonal[row + col] = 0;
          upperDiagonal[n - 1 + col - row] = 0;
        }
      }
    }
//     public boolean check(int row,int col, String [][] board ,int n) {
//         int duprow=row,dupcol=col;
        
//         while(row>=0 && col>=0){
            
//             if(board[row][col]=="Q") return false;
//             row--;
//             col--;
//         }
        
//         row=duprow;
//         col=dupcol;
        
//         while(col>=0){
//             if(board[row][col]=="Q") return false;
//             col--;
//         }
//         row=duprow;
//         col=dupcol;   
        
//         while(row<n && col>=0){
//             if(board[row][col]=="Q") return false;
//             row++;
//             col--;
//         }
//         return true;
        
//     }
    public List<String> convert(String [][] board ,int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String [] a = board[i];
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < a.length; j++) 
                sb.append(a[j]);
                  
            list.add(sb.toString());
        }
        return list;
    }
}