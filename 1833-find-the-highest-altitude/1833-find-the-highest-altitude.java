class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0, max = 0;
        for(int i: gain) {
            sum += i;
            max = Math.max(max, sum); 
        }
        return max;
    }
}