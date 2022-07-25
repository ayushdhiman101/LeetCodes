class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        if(coins.length==1 && amount==coins[0]) return 1;
        if(coins.length==1 && amount%coins[0]!=0) return -1;
        
        return solve(coins,amount);
    }
    
    public int solve(int[] coins, int amount) {
      
        int n=coins.length;
        int [][] t=new int [n+1][amount+1];

        for(int i=0;i<amount+1;i++) t[0][i]=Integer.MAX_VALUE-1;
        for(int i=0;i<n+1;i++) t[i][0]=0;

        for(int j=1;j<amount+1;j++){
            if(j%coins[0]==0)
                t[1][j]=j/coins[0];
            else
                t[1][j]=Integer.MAX_VALUE-1;
        }
        for(int i=2;i<n+1;i++){
            for(int j=1;j<amount+1;j++){
                if(coins[i-1]<=j)
                    t[i][j]=Math.min(t[i][j-coins[i-1]]+1,t[i-1][j]);
                else
                    t[i][j]=t[i-1][j];
            }
        }
        if(t[n][amount] == Integer.MAX_VALUE-1 ) return -1 ;
        else return t[n][amount];
    }
}
