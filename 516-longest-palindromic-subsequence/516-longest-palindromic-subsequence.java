class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String temp = sb.reverse().toString();
        
        int n = s.length();
        int t[][] = new int[n+1][n+1];
        for(int i=0;i<n+1;i++) t[i][0]=0;
        for(int i=0;i<n+1;i++) t[0][i]=0;
        
        int max= Integer.MIN_VALUE;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==temp.charAt(j-1))
                    t[i][j]=1 + t[i-1][j-1];
                else
                    t[i][j]= Math.max(t[i-1][j],t[i][j-1]);
                
                max=Math.max(max,t[i][j]);
            }
        }
        
        return max;
    }
}