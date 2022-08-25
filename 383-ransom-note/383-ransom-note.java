class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']+=1;
        }
         for(int i=0;i<ransomNote.length();i++){
             if(arr[ransomNote.charAt(i)-'a']!=0)
                   arr[ransomNote.charAt(i)-'a']-=1;
             else
                 return false;
        }
        return true;
    }
}