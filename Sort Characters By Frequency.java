// Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

// Return the sorted string. If there are multiple answers, return any of them.

 

// Example 1:
// Input: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
  
// Example 2:
// Input: s = "cccaaa"
// Output: "aaaccc"
// Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
// Note that "cacaca" is incorrect, as the same characters must be together.
  
// Example 3:
// Input: s = "Aabb"
// Output: "bbAa"
// Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
// Note that 'A' and 'a' are treated as two different characters.

class Solution {
    public String frequencySort(String s) {
        HashMap <String, Integer> map=new HashMap<>();
        //ADDING VALUES TO MAP
        for(int i=0;i<s.length();i++){
            if(map.containsKey(String.valueOf(s.charAt(i)))){
                int count=map.get(String.valueOf(s.charAt(i)));
                map.put(String.valueOf(s.charAt(i)),count+1);
            }
            else
               map.put(String.valueOf(s.charAt(i)),1);
        }
        //CALLING SORTING FUNCTION
        map=sortByValue(map);
        
        //STORING KEYS IN STRING
        String temp="";
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            for(int i=0;i<en.getValue();i++)
                temp+= en.getKey();
        }
   return temp;     
}
    
     public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> unSortedMap ){
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
 
        unSortedMap.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
            .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        return reverseSortedMap;
    }
}
