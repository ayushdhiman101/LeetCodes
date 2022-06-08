class Solution {
    public int removePalindromeSub(String s) {
        if(isPalindrome(s))
            return 1;
        return 2;
    }
    public boolean isPalindrome(String s){
        int l=0, h= s.length()-1;
        while(l<h){
            if(s.charAt(l++)!=s.charAt(h--))
                return false;
        }
        return true;
    }
}