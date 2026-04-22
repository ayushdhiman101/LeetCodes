class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0) return ans;
        Arrays.sort(candidates);
        combinationSum2(candidates, target, new ArrayList<>(), 0);
        return ans;
    }
    public void combinationSum2(int[] candidates, int target, List<Integer> list,  int idx) {
        if(target == 0) {
            List<Integer> temp = new ArrayList<>();
            for(int i: list) temp.add(i);
            if(!ans.contains(temp))
            ans.add(new ArrayList<>(temp));
            return;
        }

        
        // if(candidates[idx] == target) {
        //     ans.add(new ArrayList<>(candidates[idx]));
        //     return;
        // }
                if(target < 0 || idx == candidates.length) return;

                int nextIdx = idx + 1;
        while (nextIdx < candidates.length && candidates[nextIdx] == candidates[idx]) {
            nextIdx++;
        }

        list.add(candidates[idx]);
        combinationSum2(candidates, target - candidates[idx], list, idx+1);
        list.removeLast();
        combinationSum2(candidates, target, list, nextIdx);
        return;

    }
}
