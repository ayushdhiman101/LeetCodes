class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        solve(nums,list,list2,0);
        return list;
    }
    void solve(int[] nums, List<List<Integer>> list,List<Integer> op, int i) {
        if(i==nums.length){
            Collections.sort(op);
            if(!list.contains(op))
                list.add(op);
            return;
         }
         
        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);
        
        op2.add(nums[i]);
            
        solve(nums,list,op1,i+1);
        solve(nums,list,op2,i+1);
        
        return;
         
     }
    
}