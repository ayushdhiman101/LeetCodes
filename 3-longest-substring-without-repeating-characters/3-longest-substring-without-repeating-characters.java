class Solution {
    public int lengthOfLongestSubstring(String s) {
        int globalmax=0;
        for(int i=0;i<s.length();i++){
            int max=0;
            ArrayList <Character> list = new ArrayList<>();
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                if(!list.contains(c)){
                    list.add(c);
                    max++;
                    globalmax=Math.max(max,globalmax);
                }
                else
                    break;
                
            }
        }
     return globalmax;
    }
}