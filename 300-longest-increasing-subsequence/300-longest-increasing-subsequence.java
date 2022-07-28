class Solution {
   
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int t[] = new int[n];
        
        if(nums.length==1) return 1;
        
        int max=Integer.MIN_VALUE;
       
 
        for (int i = 0; i < n; i++) t[i] = 1;
 
        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j] && t[i] < t[j] + 1)
                    t[i] = t[j] + 1;
                max=Math.max(t[i],max);
            }
        }
 
 
        return max;
    }
}