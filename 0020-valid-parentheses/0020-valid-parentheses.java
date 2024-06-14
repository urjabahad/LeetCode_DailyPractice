class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false; 
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(i); // Push index of opening bracket onto stack
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; 
                }
                
                int top = stack.pop(); // Get the index of the corresponding opening bracket
                
                // Check if the types match
                if ((c == ')' && s.charAt(top) != '(') ||
                    (c == '}' && s.charAt(top) != '{') ||
                    (c == ']' && s.charAt(top) != '[')) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
}
