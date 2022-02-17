class Solution {
    List<List<Integer>> result;
    
public List<List<Integer>> combinationSum(int[] candidates, int target) {
	result = new ArrayList<>();
	Arrays.sort(candidates);
	
	helper(candidates, target, 0, new ArrayList<>());

	return result;
}

public void helper(int[] candidates, int target, int index, List<Integer> current) {
	if(target < 0)
		return;

	if(target == 0) {
		result.add(current);
		return;
	}

	for(int i = index ; i < candidates.length ; i++) {
		List<Integer> temp = new ArrayList<>(current);
		temp.add(candidates[i]);

		helper(candidates, target - candidates[i], i, temp);
	}
}
}