class Solution {
    public int maxProduct(int[] nums) {
         int ans=nums[0], max=nums[0],min=nums[0];
        
        
        for(int i=1;i<nums.length;i++){
            int temp=max;
            max=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min=Math.min(nums[i],Math.min(nums[i]*temp,nums[i]*min));
            ans=Math.max(max,ans);

            
        }
        
        return ans;
        
    }
}