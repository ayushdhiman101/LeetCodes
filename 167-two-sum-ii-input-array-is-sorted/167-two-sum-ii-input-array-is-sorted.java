class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length==0)  return null;
        map.put(target-nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(nums[i])) return new int[] {map.get(nums[i])+1,i+1};
            map.put(target-nums[i],i);
        }
        return null;
    }
}