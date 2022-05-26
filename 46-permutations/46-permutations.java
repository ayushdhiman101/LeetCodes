class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        solve(nums,ans,0);
        return ans;
    }
    public void solve(int[] nums, List<List<Integer>> ans , int i) {
       if (i == nums.length) {
            List < Integer > ds = new ArrayList < > ();
            for (int k = 0; k < nums.length; k++) {
                ds.add(nums[k]);
            }
            ans.add(new ArrayList < > (ds));
            return;
        }
        
        for (int j = i; j < nums.length; j++) {
            swap(nums,i,j );
            solve(nums,ans,i + 1);
            swap(nums,i,j);
        }
        
        return;
    }
    
    public void   swap(int [] nums, int i, int j) {
          int temp=  nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
    }
    
}