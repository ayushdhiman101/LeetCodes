class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []>  list= new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        for(int [] i: intervals){
            if(i[0]<=end){
                end=Math.max(i[1],end);
            }
            else{
                int [] temp={start,end};
                list.add(temp);
                start=i[0];
                end=i[1];
            }
        }
        int [] temp={start,end};
        list.add(temp);
        
        return list.toArray(new int[0][]);

        
    }
}