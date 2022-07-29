class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],nums[i]+sum);
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}