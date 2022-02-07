class Solution {
    public char findTheDifference(String s, String t) {
        
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length==0) return arr2[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return arr2[i];
        }
        return arr2[arr2.length-1];
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         HashMap <Character,Integer> hash=new HashMap<>();
//         for(char i : s.toCharArray())
//             if(!(hash.containsKey(i)))
//                 hash.put(i,1);
//             else 
//                 hash.put(i,hash.get(i)+1);
          
//         for(char i : t.toCharArray())
//             if(hash.containsKey(i) && hash.get(i)>0){
//                 hash.put(i,hash.get(i)-1);
//             }
//             else if(hash.containsKey(i) && hash.get(i)==0){
//                 return i;
//             }
//             else {
//                 return i;
//             }
//         return '';  
    }
}