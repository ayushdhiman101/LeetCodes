// Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
// Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

  
// O(N^2)
  class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
            if(s[j]>=g[i] && s[j]!=0&&g[i]!=0){
                count++;
                s[j]=0;
                g[i]=0;
                } 
            }
            
            
        }
        return count;
        
    }
}

// O(N)
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = s.length-1;
        int j = g.length-1;
        int count = 0;
        while (i >= 0 && j>=0){
            if(g[j] <= s[i]){
                count += 1;
                i -= 1;
            }
            j -= 1;
        }
        return count;
    }
}
