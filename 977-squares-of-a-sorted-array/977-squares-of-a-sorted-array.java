class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int idx=nums.length-1;
        int ans [] = new int[nums.length];
        
        while(left<=right){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                ans[idx]=nums[right]*nums[right];
                idx--;
                right--;
            }
            else{
                ans[idx]=nums[left]*nums[left];
                idx--;
                left++;
            }
        }
        return ans;
    }
}