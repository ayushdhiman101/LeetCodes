// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

class Solution {
    public String[] findWords(String[] words) {
        ArrayList <String> list =new ArrayList<String>();
        String a= "qwertyuiop";
        String b= "asdfghjkl";
        String c= "zxcvbnm";
        
                
        int flag=0;
        for(int i=0;i<words.length;i++){
                String s = words[i].toLowerCase();
                boolean b1=true,b2=true,b3=true;

                for(int j=0;j<s.length();j++){
                                     
                    if(!a.contains(String.valueOf(s.charAt(j)))){
                        b1=false;
                    }
                    if(!b.contains(String.valueOf(s.charAt(j)))){
                        b2=false;
                    }
                    if(!c.contains(String.valueOf(s.charAt(j)))){
                        b3=false;
                    }
                    
                }          
            if(b1||b2||b3) list.add(words[i]);
            }
        
        
        StringBuilder sb=new StringBuilder();
        for(String i : list){
            sb.append(i);
            
        }
        
        String [] str=new String[list.size()];
        int j=0;
        for(String i : list){
            str[j]=i;
            j++;
        }
        return str;
        
    }
}
