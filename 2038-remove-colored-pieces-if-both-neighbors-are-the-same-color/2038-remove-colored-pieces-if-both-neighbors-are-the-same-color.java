class Solution {
     public boolean winnerOfGame(String s) {
        int alice = 0, bob = 0;
        for(int i=0;i<s.length()-2;i++){
            String sub = s.substring(i,i+3);
            if(sub.equals("AAA"))
                alice++;
            if(sub.equals("BBB"))
                bob++;
        }
        if(alice>bob)
            return true;
        return false;
    }
}