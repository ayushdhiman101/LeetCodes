class Solution {
    public boolean detectCapitalUse(String word) {
        int lower=0;
        int upper=0;
        
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) upper++;
            else lower++;
        }
        
        if(upper==word.length() || lower==word.length() || (Character.isUpperCase(word.charAt(0)) && upper==1)) return true;
        else return false;
        
    }
}