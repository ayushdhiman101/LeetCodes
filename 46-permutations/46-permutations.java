class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,ans,0);
        return ans;
        
    }
    public void solve(int[] nums,List<List<Integer>> ans,int i) {
        if(i==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int k:nums) temp.add(k);
            ans.add(temp);
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            solve(nums,ans,i+1);
            swap(nums,i,j);
        }
        return;
        
    }
    public void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}