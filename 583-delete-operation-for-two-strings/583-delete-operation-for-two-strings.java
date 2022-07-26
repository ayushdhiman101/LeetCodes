class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        
        int t[][] = new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++) t[i][0]=0;
        for(int i=0;i<m+1;i++) t[0][i]=0;
        
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];
                else    
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
            }
        }
        
        return((n-t[n][m])+(m-t[n][m]));
    }
}