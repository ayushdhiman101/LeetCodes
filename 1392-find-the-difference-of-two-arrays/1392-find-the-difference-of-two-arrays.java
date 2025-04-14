class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();

        for(int i: nums1) nums1Set.add(i);
        for(int i: nums2) nums2Set.add(i);

        List <List <Integer>> list = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(int i : nums1Set) {
            if(!nums2Set.contains(i)) list.get(0).add(i);
        }
        for(int i : nums2Set) {
            if(!nums1Set.contains(i)) list.get(1).add(i);
        }
        return list;
        
    }
}