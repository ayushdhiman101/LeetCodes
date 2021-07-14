//S and T are strings composed of lowercase letters. In S, no letter occurs more than once.

//S was sorted in some custom order previously. We want to permute the characters ofTso that they match the order thatSwas sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.

//Return any permutation of T(as a string) that satisfies this property.

class Solution {
    public String customSortString(String S, String T) {
        
        int[] count = new int[26];
        for (char c : T.toCharArray()){ 
            ++count[c - 'a']; 
        }  
        StringBuilder sb = new StringBuilder();
        
        for (char c : S.toCharArray()) {                            
            while (count[c - 'a']-- > 0) { 
                sb.append(c); 
            }    
        }
        for (char c = 'a'; c <= 'z'; ++c) {
            while (count[c - 'a']-- > 0) { sb.append(c); }   
        }
        
        return sb.toString();
    }
}
