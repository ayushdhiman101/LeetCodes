class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        if(s.length() == 0 ) return true; 
        for( int right = 0; right < t.length(); right++ ) {
            if( left < s.length() && s.charAt(left) == t.charAt(right) ) 
                left++;
        }
        if( left == s.length() ) return true;
        return false;
        
    }
}