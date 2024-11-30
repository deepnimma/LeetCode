class Solution {
    public int evalRPN(String[] tokens) {
        // Setup Tokens
        String[] tokenArr = new String[] {"+", "-", "*", "/"};
        Set<String> tokenSet = new HashSet<>();

        for (String s : tokenArr) tokenSet.add(s);
        
        // Create Vars
        Stack<Integer> hold = new Stack<>();
        int x = 0, y = 0;

        // evalRPN
        for (String t : tokens) {
            if (!tokenSet.contains(t)) {
                hold.push(Integer.parseInt(t));
                continue;
            } // if

            x = hold.pop();
            y = hold.pop();

            if (t.equals("+")) {
                hold.push(x + y);
            } else if (t.equals("-")) {
                hold.push(y - x);
            } else if (t.equals("*")) {
                hold.push(x * y);
            } else {
                hold.push(y / x);
            } // if-else if-else if-else
        } // for

        return hold.pop();
    } // evalRPN
} // Solution