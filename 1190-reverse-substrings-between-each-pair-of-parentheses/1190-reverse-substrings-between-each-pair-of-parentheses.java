class Solution {
    public String reverseParentheses(String s) {
       Stack<Character> stack = new Stack<>();
	       
	        for(char ch:s.toCharArray()) { 
	            
	            
	            if(ch == ')') {
	                String temp="";
	                do{
	                temp+=stack.pop();
	                }while(temp.charAt(temp.length()-1)!='(');
	                StringBuilder sb = new StringBuilder(temp);
	                
	                for(int i=0;i<sb.length()-1;i++) 
	                    stack.push(sb.charAt(i));
	            }
	           else
	              stack.push(ch); 
	                
	        }                
	        String ans="";
	        while(!stack.isEmpty()){
	           
	            
	                ans+=stack.pop();
	        }
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
	        return sb.toString();
	    }  
	}
	      