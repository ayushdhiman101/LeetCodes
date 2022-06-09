class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int pos = nums.length - 1;
        int[] output = new int[nums.length];

        while (j >= i) {
            int first = nums[i] * nums[i];
            int second = nums[j] * nums[j];
            if (first >= second) {
                output[pos--] = first;
                i++;
            } else {
                output[pos--] = second;
                j--;

            }
        }

        return output;  
        
        
    }
}