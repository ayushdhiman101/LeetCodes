class Solution {
    public int removeDuplicates(int[] nums) {
//short solution
    //     int i = 0;
    // for (int n : nums)
    //     if (i < 2 || n > nums[i-2])
    //         nums[i++] = n;
    // return i;

//explained approach
        int len = 2;
      int n = nums.length;
      if(n < 2)return n;
      for(int i = 2; i < n; i++){
         if( nums[i] != nums[len - 2] || nums[i] != nums[len - 1]){
            nums[len] = nums[i];
            len++;
         }
      }
      return len;
    }
}