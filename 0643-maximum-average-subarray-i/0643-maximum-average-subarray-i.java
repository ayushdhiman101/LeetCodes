class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0, sum = 0;;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        maxAvg = sum;
        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxAvg = Math.max(sum, maxAvg);
        }
        return maxAvg / k;
    }
}