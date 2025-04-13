class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, max = 0;
        for(int right = 1; right < prices.length; right++) {
            max = Math.max(max, prices[right] - prices[left]);
            if(prices[right] < prices[left]) left = right;
        }
        return max;
    }
}