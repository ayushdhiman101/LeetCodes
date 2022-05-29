class Solution {
    public int maxProduct(String[] words) {
        int bitmasks[] = new int[words.length];
        int max = 0;
        
        //Creating bit masks for all the words
        for(int i=0;i<words.length;i++){
            for(char ch: words[i].toCharArray()){
                bitmasks[i]|=1<<(ch-'a');
            }
        }
        
        //Updating max in case the 'AND' operation of two bitmasks returns 0 which means there is no common character in the words.
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if((bitmasks[i] & bitmasks[j])==0){
                    max = Math.max(max,words[i].length()*words[j].length());
                }
            }
        }
        
        return max;
    }
}