class Solution {
    public void sortColors(int[] nums) {
        TreeMap<Integer, Integer> map= new TreeMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        int j=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int x=map.get(entry.getKey());
            int temp=entry.getKey();
            for(int i=0;i<x;i++){
                nums[j]=temp;
                j++;
            }
        }
    }
}