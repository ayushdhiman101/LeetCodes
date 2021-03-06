//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

class Solution {
    public int maxArea(int[] height) {
        int i = 0; 
        int j = height.length - 1;
        int maxArea = 0;
        
        while(i < j) {
            int iheight = height[i];
            int jheight = height[j];
            int minHeight = Math.min(iheight, jheight); 
            int width = j - i;
            int currArea = minHeight * width;
            maxArea = Math.max(maxArea, currArea);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
