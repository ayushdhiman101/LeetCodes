class Solution {
   
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        boolean z =check(candidates,target);
        if(z) return ans;
        boolean x =check2(candidates,target,ans);
        if(x) return ans;
        
        
        solve(candidates,target,ans,op,0);
        return ans;
        
    }
     public void solve(int[] candidates ,int target ,List<List<Integer>>ans,List<Integer> op,int i){
         
         if(target==0){
             Collections.sort(op);
             if(!ans.contains(op))
                ans.add(op);
         }
         
         if(target<0 || i>=candidates.length)
             return;
         
         ArrayList<Integer> op1= new ArrayList<>(op);
         ArrayList<Integer> op2= new ArrayList<>(op);
         
         op2.add(candidates[i]);
                 
         solve(candidates,target,ans,op1,i+1);
         solve(candidates,target-candidates[i],ans,op2,i+1);
         
           
         return;
             
     }
    public boolean check(int[] candidates ,int target ){
        int sum=0;
        for(int i:candidates){
            sum+=i;
        }
        return sum<target ? true : false; 
    }
    public boolean check2(int[] candidates ,int target ,List<List<Integer>>ans){
        int x=target;
        List<Integer> try1 = new ArrayList<>();
        for(int i:candidates)
            if(i!=1) return false;
        
        while(x!=0){
            try1.add(1);
            x-=1;
        }
        ans.add(try1);
        return true;
        }
    }

        
