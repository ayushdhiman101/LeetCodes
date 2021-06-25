// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.

class Solution {
    public boolean isValid(String s) {

        Stack<String> stack = new Stack<>();
        HashMap<String, String> map = new HashMap<>();

        map.put(")", "(");
        map.put("}", "{");
        map.put("]", "[");

        for (int i = 0; i < s.length(); i++) {

            String a = String.valueOf(s.charAt(i));

            if (a.equals("(") || a.equals("{") || a.equals("[")) {
                stack.push(a);
            } else if ((a.equals(")") || a.equals("}") || a.equals("]"))) {

                if (stack.isEmpty())
                    return false;

                String x = stack.peek();
                if (x.equals(map.get(a)))
                    stack.pop();
                else
                    return false;
            }

        }

        return stack.isEmpty();
    }
}