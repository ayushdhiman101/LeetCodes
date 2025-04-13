class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, max = 0, zero = 0;

        for(int right = 0; right < nums.length; right ++) {
            if(nums[right] == 0) zero++;
            while(left < nums.length && zero > 1) {
                if(nums[left] == 0) 
                    zero--;
                left++;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}