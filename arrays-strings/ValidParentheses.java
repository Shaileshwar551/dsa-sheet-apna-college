class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                charStack.push(s.charAt(i));
            }

            else if(s.charAt(i) == ')'  && !charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop(); 
            }

            else if(s.charAt(i) == '}'  && !charStack.isEmpty() && charStack.peek() == '{') {
                charStack.pop(); 
            }
            else if(s.charAt(i) == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
                charStack.pop(); 
            } 
            else {
                return false;
            }
        }

        return charStack.isEmpty(); 
    }
}