// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.


// O(N) TIME ALGORITHM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> list=new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max) max=candies[i]; 
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}
// O(N^2) TIME ALGORITHM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> list=new ArrayList<Boolean>();
        int max=0,flag=0,calc=0;
        for(int i=0;i<candies.length;i++){
            calc=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(i!=j){
                    if(!(calc>=candies[j])) flag=1;
                }       
            }
            if(flag==1) list.add(false);
            else list.add(true);    
            flag=0;
            
            
        }
        return list;
    }
}
