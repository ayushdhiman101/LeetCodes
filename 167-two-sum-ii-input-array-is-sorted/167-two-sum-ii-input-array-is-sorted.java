// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         if(nums.length==0)  return null;
//         map.put(target-nums[0],0);
//         for(int i=1;i<nums.length;i++){
//             if(map.containsKey(nums[i])) return new int[] {map.get(nums[i])+1,i+1};
//             map.put(target-nums[i],i);
//         }
//         return null;
//     }
// }
class Solution {
public int[] twoSum(int[] arr, int target) {
int i=0,j=arr.length-1;
while(i<j){
int sum = arr[i] + arr[j];
if(sum == target) return new int[]{i+1,j+1};
else if(sum < target) i++;
else j--;
}
return null;
}
}