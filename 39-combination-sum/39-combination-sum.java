class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        solve(candidates,target,ans,op,0);
        return ans;
        
    }
     public void solve(int[] candidates ,int target ,List<List<Integer>>ans,List<Integer> op,int i){
         
         if(target<0 || i==candidates.length)
             return;
         if(target==0){
             if(!ans.contains(op))
                ans.add(op);
         }
         
         ArrayList<Integer> op1= new ArrayList<>(op);
         ArrayList<Integer> op2= new ArrayList<>(op);
         
         op2.add(candidates[i]);
         
         solve(candidates,target,ans,op1,i+1);
         solve(candidates,target-candidates[i],ans,op2,i);
         
           
         return;
             
     }
}