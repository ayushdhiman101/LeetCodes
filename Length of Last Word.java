// Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

// A word is a maximal substring consisting of non-space characters only.

class Solution {
    public int lengthOfLastWord(String s) {

        if (s == null)
            return 0;
        String[] words = s.split(" ");
        int len = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            len = words[i].length();
            if (len > 0)
                break;
        }
        return len;

    }
}