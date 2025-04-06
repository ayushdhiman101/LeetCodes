class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        while(l <= nums.length - 1 && nums[l] !=0) l++;
        int r = l;
        while(r <= nums.length - 1 && l <= nums.length - 1) {
            if (nums[l] == 0 && nums[r] != 0) {
                swap(nums, l, r);
                l++;
            }
        r++;
        }
    }
    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}