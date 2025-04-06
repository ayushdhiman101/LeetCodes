class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        for(int right = 0; right < nums.length; right++)
        {
            if (nums[right] != 0) {
                swap(nums, l, right);
                l++;
            }
        }
    }
    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}