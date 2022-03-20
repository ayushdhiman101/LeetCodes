class Solution {
public:
    bool winnerOfGame(string s) {
        int n=s.size();
        int cnta=0,cntb=0;
        int acta=0,actb=0;
        char ch=s[0];
        if(ch=='A')cnta++;
        else cntb++;
        for(int i=1;i<n;i++){
            if(ch==s[i]){
                if(ch=='A')cnta++;
                else cntb++;
            }
            else{
                if(ch=='A'){
                    acta+=cnta-2<0?0:cnta-2;
                    cnta=0;
                    cntb=1;
                    ch=s[i];
                }
                else{
                    actb+=cntb-2<0?0:cntb-2;
                    cntb=0;
                    cnta=1;
                    ch=s[i];
                }
            }
        }
        if(ch=='A')acta+=cnta-2<0?0:cnta-2;
        else actb+=cntb-2<0?0:cntb-2;
        if(actb>acta){
            return false;
        }
        else if(acta==actb){
            return false;
        }
        return true;
    }
};