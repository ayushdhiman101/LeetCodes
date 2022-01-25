class Solution {
    public boolean validMountainArray(int[] arr) {
       
        if(arr.length==1) return false;
        
        int i=1;
        boolean flag=false;;
        while(i<arr.length && arr[i]>arr[i-1]){
            i++;
            flag=true;
        }
        boolean flag2=false;
        while(i<arr.length && arr[i]<arr[i-1] && flag){
            i++;
            flag2=true;
        }
        return (i==arr.length && flag && flag2);
        
        
    }
}