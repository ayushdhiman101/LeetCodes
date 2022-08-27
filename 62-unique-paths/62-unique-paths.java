class Solution {
    public int uniquePaths(int m, int n) {
        int t[][] = new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++) t[i][0]=1;
        for(int j=0;j<n+1;j++) t[0][j]=1;
        
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                t[i][j]=t[i-1][j] + t[i][j-1];
            }
        }
        
        return t[m-1][n-1];
    }
}