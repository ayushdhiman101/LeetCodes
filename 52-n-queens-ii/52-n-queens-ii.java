class Solution {
    int count=0;
    public int totalNQueens(int n) {
        int board[][] = new int[n][n];
        
        int left[]=new int[n];
        int leftUpper[]=new int[2*n-1];
        int leftLower[]=new int[2*n-1];
        
        solve(n,board,0,left,leftUpper,leftLower);
        
        return count;
    }
    public void solve(int n,int board[][],int col,int left[],int leftUpper[],int leftLower[]){
        if(col==n){
            count++;
            return;
        }
        for(int i=0;i<n;i++){
            if(left[i]==0 && leftLower[i+col]==0 && leftUpper[n-1+col-i]==0){
                left[i]=1;
                leftLower[i+col]=1;
                leftUpper[n-1+col-i]=1;
                board[i][col]=1;
                   
                solve(n,board,col+1,left,leftUpper,leftLower);
                  
                left[i]=0;
                leftLower[i+col]=0;
                leftUpper[n-1+col-i]=0;
                board[i][col]=0;
                
            }
        }
    }
}