class Solution {
    public char findTheDifference(String s, String t) {
        HashMap <Character,Integer> hash=new HashMap<>();
        for(char i : s.toCharArray())
            if(!(hash.containsKey(i)))
                hash.put(i,1);
            else 
                hash.put(i,hash.get(i)+1);
            
        for(char i : t.toCharArray())
            if(hash.containsKey(i) && hash.get(i)>0){
                hash.put(i,hash.get(i)-1);
            }
            else if(hash.containsKey(i) && hash.get(i)==0){
                return i;
            }
            else if (!(hash.containsKey(i))){
                return i;
            }
        return 'N';  
    }
}