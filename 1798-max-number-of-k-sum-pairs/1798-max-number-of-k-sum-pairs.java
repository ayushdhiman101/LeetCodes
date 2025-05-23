class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1, ans = 0;
        while(left < right) {
            if (nums[left] + nums[right] < k)
                left++;
            else if (nums[left] + nums[right] > k)
                right--;
            else{
                ans++;
                left++;
                right--;
            }
        }
        return ans;
    }
}