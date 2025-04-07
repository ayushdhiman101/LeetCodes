class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(left <= right && left < height.length && right >= 0) {
           max = Math.max(Math.min(height[left], height[right]) * (right - left), max);
            if(height[left] < height[right]) {
                left ++;
            }
            else right --;
        }
        return max;
    }
}