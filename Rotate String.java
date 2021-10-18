class Solution {
    public boolean rotateString(String s, String goal) {
        String sl=s;
        String sr=s;
        for(int i=0;i<s.length();i++){
            sl=leftrotate(sl, 1);
            sr=leftrotate(sr, 1);
            if(sl.equals(goal) || sr.equals(goal)) return true;
        }
        return false;
    }
    static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
 
    // function that rotates s towards right by d
    static String rightrotate(String str, int d)
    {
            return leftrotate(str, str.length() - d);
    }
}
