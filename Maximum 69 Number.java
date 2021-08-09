// Given a positive integer num consisting only of digits 6 and 9.

// Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

class Solution {
    public int maximum69Number (int num) {
        
    StringBuilder sb = new StringBuilder();
        
    while (num > 0) {
        sb.append(num % 10);
        num /= 10;
    }
    sb.reverse();    
    for (int i = 0; i < sb.length(); i++) {
        if (sb.charAt(i) != '9') {
        sb.replace(i, i + 1, "9");
        break;
        }
    }
return Integer.parseInt(sb.toString());
    }           
}
        
        
    
