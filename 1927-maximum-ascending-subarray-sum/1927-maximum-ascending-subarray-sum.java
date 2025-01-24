class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0, maxSum = 0, prev = -1;
       for(int i: nums) {
            if(prev < i) {
                sum += i;
                maxSum = Math.max(maxSum, sum);
            }
            else {
                sum = i;
            }
            prev = i;
       }
       return maxSum;
    }
}