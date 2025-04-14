class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0, right = nums.length - 1, sumRight = 0, sumLeft = 0;

        for(int i : nums )
            sumRight += i; 

        for(int i = 0; i < nums.length; i++){
            sumRight -= nums[i];
            if(sumLeft == sumRight) return i;
            sumLeft += nums[i];
        }
        return -1;
    }
}