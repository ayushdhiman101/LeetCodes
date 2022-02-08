class Solution {
    public int addDigits(int num) {
        int temp=num;
        while(!(temp<10 && temp>=0)){
             int sum=0;
            int number=temp;
            while(number > 0){  
                int digit = number % 10;  
                sum = sum + digit;  
                number = number / 10;  
            }  
            temp=sum;
            
        }
        return temp;
    }
}