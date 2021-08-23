// International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

// 'a' maps to ".-",
// 'b' maps to "-...",
// 'c' maps to "-.-.", and so on.
// For convenience, the full table for the 26 letters of the English alphabet is given below:

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        ArrayList <String> list=new ArrayList <>();
        String morse []= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        int counter=0;
        for(int i=0;i<words.length;i++){
            String a=words[i];
            StringBuilder sb = new StringBuilder();
            
            for(int j=0;j<a.length();j++){
                char c = a.charAt(j); 
                int ascii = (int)c;
                ascii-=97;
                sb.append(morse[ascii]);
            }
            
            String str = sb.toString();
            
            if(!list.contains(str)) {
                list.add(str);
                counter++;
            }
        }
        return counter;
    }  
}      
        
