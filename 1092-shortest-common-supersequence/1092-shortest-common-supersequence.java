class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        
        int t[][] = new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++) t[i][0]=0;
        for(int i=0;i<m+1;i++) t[0][i]=0;
        
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];
                else    
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        
        int i=n,j=m;
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));
                i--;j--;
            }
            else{
                 if(t[i-1][j]>t[i][j-1]){
                     sb.append(str1.charAt(i-1));
                     i--;
                 }
                 else {
                     sb.append(str2.charAt(j-1));
                     j--;
                 }
             }
        }
        
       while(i>0){ 
           sb.append(str1.charAt(i-1));
            i--;
       }
        while(j>0){ 
           sb.append(str2.charAt(j-1));
            j--;
       }
        
        return sb.reverse().toString();
        
    }
}