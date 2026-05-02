class Solution {
    public int rotatedDigits(int n) {
        HashMap <Integer, Integer> map = new HashMap<>() {{
            put(0, 0);
            put(1, 1);
            put(2, 5);
            put(5, 2);
            put(6, 9);
            put(8, 8);
            put(9, 6);
        }};
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int [] digits = allDigits(i);
            int allSame = 0;
            boolean flag = false;
            for(int j: digits) {
                if(!map.containsKey(j)) {
                    flag = true;
                    break;
                }
                if(map.get(j) == j) allSame++;
            }
            if(allSame != digits.length && !flag) count++;
        }
        return count;
    }
    public int[] allDigits (int number){
        return String.valueOf(number)
                     .chars()
                     .map(Character::getNumericValue)
                     .toArray();
        
    }
}