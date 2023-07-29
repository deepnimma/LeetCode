class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        if (s.length() % 2 != 0)
            return false;

        for (char c : s.toCharArray()) {
            if (myStack.size() == 0 || "({[".indexOf(c) != -1)
                myStack.push(c);
            else {
                if(!checkBracket(myStack.pop(), c))
                   return false;
            }  // if-else
        } // FOR

        if (myStack.size() != 0)
            return false;

        return true;
    } // isValid

    private boolean checkBracket(char a, char b) {
        if ((a == '(' && b == ')') ||
        (a == '[' && b == ']') ||
        (a == '{' && b == '}'))
            return true;
        return false;
    } // checkBracket
} // Solution