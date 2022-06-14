class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        
        int x= LCS(word1,word2,m,n);
        
        int deletion=m-x;
        int insertion=n-x;
        return deletion+insertion;
        
    }
    public int LCS(String a, String b,int m,int n){
            int t[][]=new int [m+1][n+1];
            
            for(int i=0;i<m+1;i++) t[i][0]=0;
            for(int j=0;j<n+1;j++) t[0][j]=0;
            
            for(int i=1;i<m+1;i++){
                for(int j=1;j<n+1;j++){
                    if(a.charAt(i-1)==b.charAt(j-1))
                        t[i][j]=1+ t[i-1][j-1];
                    else
                        t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
            return t[m][n];
    }
}