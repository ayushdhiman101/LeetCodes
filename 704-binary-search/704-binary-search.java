class Solution {
    public int search(int[] nums, int target) {
        return bsearch(nums,target,0,nums.length-1);
    }
    public int bsearch(int []nums, int target, int low, int high)
    {
        if(high<low) return -1;
        int mid = low+(high-low)/2;
        if(nums[mid]==target)
            return mid;
        if(nums[mid]>target)
            return bsearch(nums,target,low,mid-1);
        
        return bsearch(nums,target,mid+1,high);
    }
}