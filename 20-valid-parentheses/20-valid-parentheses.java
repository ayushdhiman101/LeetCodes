class Solution {
    public boolean isValid(String s) {
        HashMap <Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        Stack <Character> stack = new Stack  <>();
        
        for(int i=0;i<s.length();i++){
            char str=s.charAt(i);
            if(map.containsKey(str)){
                if(!stack.isEmpty() && stack.peek()==map.get(str)  )
                    stack.pop();
                else
                    return false;
            }
            else
                stack.add(str);
            }
        
        if(stack.isEmpty()) return true;
        else return false;
        
    }
}