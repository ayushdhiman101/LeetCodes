class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, zero = 0, max = 0;
        for(int right = 0; right < nums.length; right++) {
            max = Math.max(max, right - left);
            if(nums[right] == 0) zero ++;
            while(left < nums.length && zero > k) {
                if(nums[left] == 0) zero--;
                left++;
            }
            max = Math.max(right - left + 1, max);
        }
        return max;
    }
}