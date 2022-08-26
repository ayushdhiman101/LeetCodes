class Solution {
    public boolean isPowerOfThree(int n) {
        int x=n,count=0;
        while(n>1){
            n/=3;
            count++;
        }
        if(Math.pow(3,count)==x) return true; 
        return false;
        
    }
}