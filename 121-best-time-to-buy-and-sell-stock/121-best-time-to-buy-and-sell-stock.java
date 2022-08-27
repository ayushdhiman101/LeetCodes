class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int minprice=prices[0];
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice)
                minprice=prices[i];
            if(prices[i]>=minprice){
                int temp=prices[i]-minprice;
                max=Math.max(max,temp);
            }
        }
        return max;
    }
}