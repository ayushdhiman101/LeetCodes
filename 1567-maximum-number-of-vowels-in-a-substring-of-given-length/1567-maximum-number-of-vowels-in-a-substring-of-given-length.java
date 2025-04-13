class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder str = new StringBuilder();
        int max = 0;
        for(int i = 0; i < k && i < s.length(); i++) {
            str.append(s.charAt(i));
            max += isVowel(s.charAt(i)) ? 1: 0;
        }
        int count = max;
        for(int i = k; i < s.length(); i++) {
            boolean addition = isVowel(s.charAt(i));
            str.append(s.charAt(i));
            boolean deletion = isVowel(str.charAt(0));
            str.deleteCharAt(0);

            if(addition == true && deletion == false ) count++;
            else if (addition == false && deletion == true) count--;
            
            max = Math.max(count, max);
            }
        return max;
    }
    public boolean isVowel ( Character letter ) {
        int count = 0;
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
            return true;
        return false;
    }
}