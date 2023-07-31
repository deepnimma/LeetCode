class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int front = 0;
        int back = c.length - 1;

        while(front <= back) {
            if (c[front] != c[back])
                return false;
            front++;
            back--;
        }

        return true;
    }
}