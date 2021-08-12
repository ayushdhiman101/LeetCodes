// Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

//ALL TEST CASES PASSED
public class Solution {

    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
}



// 80/231 TEST CASES PASSED
class Solution {
    public int longestValidParentheses(String s) {
        Stack <Character> stack=new Stack<>();
     
        int count=0;
        int flag=0;

        
      for(int i=0;i<s.length();i++){
            String d=String.valueOf(s.charAt(i));  
            
            if(!stack.isEmpty() && stack.peek().equals('(') ) flag=0;
            if(!stack.isEmpty() && stack.peek().equals('(') && d.equals(")") && flag==0) {
                stack.pop();
                count=count+2;
                flag=1;
            }
            else {
              if(d.equals("("))stack.push(s.charAt(i));
                flag=0;
                
            }
            
        }
        

        
       return count; 
    }
}
