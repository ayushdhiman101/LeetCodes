class Solution {
    public int longestStrChain(String[] words) {
        int[] dp = new int[words.length];
        Arrays.sort(words, (x, y) -> {
            return y.length() - x.length();
        });
        int res = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            map.put(words[i], i);
            dp[i] = 1;
        }
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                String str = words[i].substring(0, j) + words[i].substring(j+1, words[i].length());
                if(map.containsKey(str)){
                    int pos = map.get(str);
                    dp[pos] = Math.max(dp[pos], 1 + dp[i]);
                    res = Math.max(res, dp[pos]);
                }
            }
        }
        return res;
    }
}