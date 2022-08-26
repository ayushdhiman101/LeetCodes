class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        String board[][] = new String [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=".";
            }
        }
        solve(board,0);
        return ans;
    }
    public void solve(String board [][], int j) {
        if(j==board.length){
            ArrayList<String> list = new ArrayList<>(convert(board));
            ans.add(list);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(check(board,row,j)){
                board[row][j]="Q";
                solve(board,j+1);
                board[row][j]=".";
            }
        }
    }
    public boolean check(String board [][], int i,int j) {
        int tempi=i,tempj=j;
        while(j>=0){
             if(board[i][j]=="Q")
                 return false;
            j--;
        }
        
        j=tempj;
         while(i>=0 && j>=0){
             if(board[i][j]=="Q")
                 return false;
            i--;
            j--;
        }
        
        i=tempi;j=tempj;
        while(i<board.length  && j>=0){
             if(board[i][j]=="Q")
                 return false;
            i++;
            j--;
        }
          return true;  
        
    }
     public List<String> convert(String [][] board) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String [] a = board[i];
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < a.length; j++) 
                sb.append(a[j]);
                  
            list.add(sb.toString());
        }
        return list;
    }

}