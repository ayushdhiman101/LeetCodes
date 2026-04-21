class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        combinationSum2(nums, target, 0, 0, new ArrayList<Integer>());
        return ans;
    }
     public void combinationSum2(int[] nums, int target, int idx, int sum, List<Integer> list) {
        if(sum == target) {
            List<Integer> temp = new ArrayList<>();
            for(int i: list) temp.add(i);
            ans.add(temp);
            return;
        }
        if(sum > target || idx == nums.length) {
            return;
        }
        list.add(nums[idx]);
        sum+=nums[idx];
        combinationSum2(nums, target, idx, sum, list);
        list.removeLast();
        sum-=nums[idx];
        combinationSum2(nums, target, idx+1, sum, list);
        
    }   

}
