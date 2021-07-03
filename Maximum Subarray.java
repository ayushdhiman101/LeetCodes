//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 


class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum=nums[j]+sum;
                if(sum>max) max=sum;
            }
            sum=0;
        }
        return max;
    }
}
