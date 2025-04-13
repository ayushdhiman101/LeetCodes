class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder str = new StringBuilder();
        int max = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for(int i = 0; i < k && i < s.length(); i++) {
            str.append(s.charAt(i));
            max += vowels.contains(s.charAt(i)) ? 1: 0;
        }
        int count = max;
        for(int i = k; i < s.length(); i++) {
            boolean addition = vowels.contains(s.charAt(i));
            str.append(s.charAt(i));
            boolean deletion = vowels.contains(str.charAt(0));
            str.deleteCharAt(0);

            if(addition == true && deletion == false ) count++;
            else if (addition == false && deletion == true) count--;
            
            max = Math.max(count, max);
            }
        return max;
    }
}