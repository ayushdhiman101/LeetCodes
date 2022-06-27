class Solution {
    public int minPartitions(String str) {
         int max = 0;
    
        for(char ch : str.toCharArray()){
            if(ch-'0'>max){
                max=ch-'0';
            }
        }
        return max;
    }
}