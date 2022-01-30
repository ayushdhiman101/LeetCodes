// class Solution {
//     public void rotate(int[] nums, int k) {
//         while(k!=0){
//             int temp=nums[nums.length-1];
//             for(int i=nums.length-1;i>0;i--)
//                 nums[i]=nums[i-1];
//             nums[0]=temp;
//             k--;
//         }
//     }
// }


class Solution {
     public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(n-k , n-1 , nums);
        reverse(0 , n-k-1 , nums);
        reverse(0 , n-1 , nums);
     }
    public void reverse(int left,int right,int[] nums){
        while(left<=right && left<nums.length-1 && right>0){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
        }
    }
}
                
                
                
                
                