class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        for(int i=0;i<magazine.length();i++){
            arr[(int)magazine.charAt(i)-(int)'a']+=1;
        }
         for(int i=0;i<ransomNote.length();i++){
             if(arr[(int)ransomNote.charAt(i)-(int)'a']!=0)
                   arr[(int)ransomNote.charAt(i)-(int)'a']-=1;
             else
                 return false;
        }
        return true;
    }
}