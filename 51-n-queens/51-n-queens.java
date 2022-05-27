class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
       String [][] board = new String [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=".";
            }
        }
        solve(n,ans,board,0);
        return ans;
        
    }
    
     public void solve(int n, List<List<String>> ans, String [][] board,int col) {
         if(col==n){
            List<String> list =new ArrayList<>(convert(board,n));
            ans.add(list);
            return;
        }
        
         for(int row=0;row<n;row++){
             if(check(row,col,board,n)){
                board[row][col]="Q";
                solve(n,ans,board,col+1);
                board[row][col]=".";
              }
         }
    }
    public boolean check(int row,int col, String [][] board ,int n) {
        int duprow=row,dupcol=col;
        
        while(row>=0 && col>=0){
            
            if(board[row][col]=="Q") return false;
            row--;
            col--;
        }
        
        row=duprow;
        col=dupcol;
        
        while(col>=0){
            if(board[row][col]=="Q") return false;
            col--;
        }
        row=duprow;
        col=dupcol;   
        
        while(row<n && col>=0){
            if(board[row][col]=="Q") return false;
            row++;
            col--;
        }
        return true;
        
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