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
    
     public void solve(int n, List<List<String>> ans, String [][] board,int col ,int[]leftRow, int[]lowerDiagonal, int[]upperDiagonal) {
         if(col==n){
            List<String> list =new ArrayList<>(convert(board,n));
            ans.add(list);
            return;
        }
        
         for(int row=0;row<n;row++){
             if(leftRow[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[n-1+col-row]==0){
                 
                 board[row][col]="Q";
                 leftRow[row]=1;
                 lowerDiagonal[row+col]=1;
                 upperDiagonal[n-1+col-row]=1;
                     
                 solve(n,ans,board,col+1,leftRow,lowerDiagonal,upperDiagonal);
                 
                 board[row][col]=".";
                 leftRow[row]=0;
                 lowerDiagonal[row+col]=0;
                 upperDiagonal[n-1+col-row]=0;
                 
              }
         }
    }

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