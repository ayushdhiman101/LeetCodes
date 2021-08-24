// A complex number can be represented as a string on the form "real+imaginaryi" where:

// real is the real part and is an integer in the range [-100, 100].
// imaginary is the imaginary part and is an integer in the range [-100, 100].
// i2 == -1.
// Given two complex numbers num1 and num2 as strings, return a string of the complex number that represents their multiplications.
  
  
  class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        
        int i=0;
        while(!(String.valueOf(num1.charAt(i)).equals("+"))){
            i++;
        }
        int r1,i1;
        
        if(String.valueOf(num1.charAt(0)).equals("0")) r1=0;
        else  r1=Integer.parseInt(num1.substring(0, i));
        
        if(String.valueOf(num1.charAt(i+1)).equals("0")) i1=0;
        else  i1=Integer.parseInt(num1.substring(i+1, num1.length()-1));
        
        
        int j=0;
         while(!(String.valueOf(num2.charAt(j)).equals("+"))){
            j++;
        }
        int r2,i2;
        
        if(String.valueOf(num2.charAt(0)).equals("0")) r2=0;
        else  r2=Integer.parseInt(num2.substring(0, j));
        
        if(String.valueOf(num2.charAt(j+1)).equals("0")) i2=0;
        else  i2=Integer.parseInt(num2.substring(j+1, num2.length()-1));
                                
        int real= (r1*r2) - (i1*i2);
        int imag=(r1*i2)+(i1*r2);
                                
        String fin=real + "+" + imag+"i" ;
        
        return fin;
        
        
        
    }
}
