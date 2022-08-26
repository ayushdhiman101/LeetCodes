class Solution {
    public boolean isPowerOfFour(int n) {
        int x=n,count=0;
        while(n>1){
            n/=4;
            count++;
        }
        if(Math.pow(4,count)==x) return true; 
        return false;
        
    }
}