class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     
    int c=0;
    if(nums1.length==0 || nums2.length==0 ) {
        Arrays.sort(nums1);
        return;
    }
    
    for(int i=m;i<nums1.length;i++ ){
        if(nums1[i]==0){
        nums1[i]= nums2[c];
        c++;
        }
    }    
    Arrays.sort(nums1);
    }
}