class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0, right = 0;
        if(s.length() == 0 ) return true; 
        if(t.length() == 0 ) return false; 
        while  (right < t.length() && left < s.length()) {
            if( s.charAt(left) == t.charAt(right) ) {
                left++;
            }
            right++;
        }
        if( left == s.length() ) return true;
        return false;
        
    }
}