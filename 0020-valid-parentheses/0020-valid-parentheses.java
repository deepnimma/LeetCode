class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();

        for (char b : c) {
            if (checkOpenBracket(b)) st.push(b);
            else {
                if (!checkBrackets(st.pop(), b)) return false;
            } // if-else
        } // for

        return st.empty();
    } // isValid

    private boolean checkBrackets(char a, char b) {
        boolean paran = (a == '(') && (b == ')');
        boolean square = (a == '[') && (b == ']');
        boolean curly = (a == '{') && (b == '}');

        return paran || square || curly;
    } // checkBrackets

    private boolean checkOpenBracket(char a) {
        boolean paran = (a == '(');
        boolean square = (a == '[');
        boolean curly = (a == '{');
        
        return paran || square || curly;
    } // checkOpenBracket
} // Solution