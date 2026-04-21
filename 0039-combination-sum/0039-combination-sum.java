class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        combinationSum2(nums, target, 0, 0, new ArrayList<Integer>());
        return ans;
    }
     public void combinationSum2(int[] nums, int target, int idx, int sum, List<Integer> list) {
        if(0 == target) {
            List<Integer> temp = new ArrayList<>();
            for(int i: list) temp.add(i);
            if(!ans.contains(temp))

            ans.add(temp);
            return;
        }
        if(0 > target || idx == nums.length) {
            return;
        }
        list.add(nums[idx]);
        combinationSum2(nums, target - nums[idx], idx + 1, sum, list);
        combinationSum2(nums, target - nums[idx], idx, sum, list);


        list.removeLast();
        combinationSum2(nums, target , idx + 1, sum, list);
        
    }   

}
