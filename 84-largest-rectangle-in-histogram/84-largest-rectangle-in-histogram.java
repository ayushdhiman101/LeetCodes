// MY OWN BASIC BRUTE FORCE APPROACH PASSES 87 / 96 test cases 






// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         ArrayList<Integer> ans=new ArrayList<>();
//         for(int i=0;i<heights.length;i++){
//             int x=heights[i];
//             ans.add(heights[i]);
//         }
//         if(heights.length==2){
//             int x=Math.min( heights[0], heights[1]);
//             ans.add(x*2);
//         }    
//         else{
//             for(int len=2;len<=heights.length;len++){
//                 for(int j=0;j<=heights.length-len;j=j+1){
//                     ArrayList<Integer> list=new ArrayList<>();
//                     for(int k=j;k<j+len;k++){
//                         int x=heights[k];
//                         list.add(heights[k]);
//                     }
//                 int min=1000;
//                 for(int arritr=0;arritr<list.size();arritr++)
//                     min=Math.min(list.get(arritr),min);
//                 int y=min;
//                 ans.add(min*len);
//                 }
//             }
//         }
//         int max=-1000;
//         for(int arritr=0;arritr<ans.size();arritr++){
//             max=Math.max(ans.get(arritr),max);
//         }
//         return max;
//     }
// }
      
class Solution {
    
    public static int[] prevSmallerIndex(int[] heights){
        int[] prevSmallerIndex = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!stack.empty() && heights[stack.peek()]>= heights[i]){
                stack.pop();
            }
            if(stack.empty()){
                prevSmallerIndex[i]=-1;
            }else{
                prevSmallerIndex[i]=stack.peek();
            }
            stack.push(i);
        }
        return prevSmallerIndex;
    }

    public static int[] nextSmallerIndex(int[] heights){
        int[] nextSmallerIndex = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = heights.length-1; i >= 0; i--){
            while(!stack.empty() && heights[stack.peek()]>= heights[i]){
                stack.pop();
            }
            if(stack.empty()){
                nextSmallerIndex[i]=heights.length;
            }else{
                nextSmallerIndex[i]=stack.peek();
            }
            stack.push(i);
        }
        return nextSmallerIndex;

    }
    
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int[] prevSmallerIndex = prevSmallerIndex(heights);
        int[] nextSmallerIndex = nextSmallerIndex(heights);
        // Arrays.stream(prevSmallerIndex).forEach(i -> System.out.print(i+" "));
        // System.out.println();
        // Arrays.stream(nextSmallerIndex).forEach(i -> System.out.print(i+" "));
        for(int i = 0; i < heights.length; i++){
            maxArea=Math.max(maxArea, (nextSmallerIndex[i]-prevSmallerIndex[i]-1)*heights[i]);
        }
        return maxArea;
    }
}

 
      
 