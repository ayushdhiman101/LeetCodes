class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
	    for(char ch:s.toCharArray()){ 
	        if(ch == ')') 
	            reverse(stack);
	        else
	            stack.push(ch); 
        }
	        String ans="";
	        while(!stack.isEmpty())
	                ans+=stack.pop();
	        
            StringBuilder sb = new StringBuilder(ans);
            return sb.reverse().toString();
    }
    
    public void reverse (Stack<Character> stack){
            String temp= "";
	        do{
	            temp+=stack.pop();
	        }while(temp.charAt(temp.length()-1)!='(');
	        
	        for(int i=0;i<temp.length()-1;i++) 
	            stack.push(temp.charAt(i));
        }
	}
	      