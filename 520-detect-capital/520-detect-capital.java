class Solution {
    public boolean detectCapitalUse(String word) {
        int lower=0;
        int upper=0;
        boolean flag=false;
        if(Character.isUpperCase(word.charAt(0))){
            flag=true;
            upper++;
        }
        else 
            lower++;
        for(int i=1;i<word.length();i++){
            char a=word.charAt(i);
            if(Character.isUpperCase(word.charAt(i))) upper++;
            else lower++;
        }
        
        if(upper==word.length() || lower==word.length() || (flag==true && upper==1)) return true;
        else return false;
        
    }
}