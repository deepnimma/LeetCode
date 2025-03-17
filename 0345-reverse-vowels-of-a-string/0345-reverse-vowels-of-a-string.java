class Solution {
    public String reverseVowels(String s) {
        Set<Character> hv = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Stack<Character> st = new Stack<>(); 
        char[] cs = s.toCharArray(); // O(n)

        for (char c : cs) {
            if (hv.contains(c)) st.push(c);
        } // for

        for (int i = 0; i < cs.length; i++) {
            if (hv.contains(cs[i])) cs[i] = st.pop();
        } // for

        return new String(cs);
    } // reverseVowels
} // Solution