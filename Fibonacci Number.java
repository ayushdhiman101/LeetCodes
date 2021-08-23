//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.
        int a=0;
        int b=1;
        int answer=0;
        
        if(n==0) return a;
        
        if(n==1) return b;
        
        for(int i=2;i<=n;i++){
            answer=a+b;
            a=b;
            b=answer;

        }
        return answer;
        
