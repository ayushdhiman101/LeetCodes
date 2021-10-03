// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

class Solution {
    public List<String> generateParenthesis(int n) {
        int open=n;
        int close=n;
        String op="";
        ArrayList<String> v=new ArrayList<String>();
        solve(open,close,op,v);
        return v;
        
    }
    public void solve ( int open,int close, String op,List<String> v){
        if(open==0 && close==0){
            v.add(op);
        }
        
        if(open!=0){
            StringBuilder op1=new StringBuilder(op);
            op1.append("(");
            solve(open-1,close,op1.toString(),v);
        }
        if(open<close){
            StringBuilder op2=new StringBuilder(op);
            op2.append(")");
            solve(open,close-1,op2.toString(),v);
            
        }
        return;
        
    }
}
