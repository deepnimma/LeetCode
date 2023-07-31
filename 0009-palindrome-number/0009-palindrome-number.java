class Solution {
    public boolean isPalindrome(int x) {
        char[] c = Integer.toString(x).toCharArray();

        int front = 0;
        int back = c.length - 1;

        while (front <= back) {
            if (c[front] != c[back])
                return false;
            front++;
            back--;
        }

        return true;
    }
}