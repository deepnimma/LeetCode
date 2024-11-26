class Solution {
    public boolean isPalindrome(String s) {
        // Cleaning string
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        char[] sc = s.toCharArray();
        int i = 0, j = sc.length - 1;

        while (i <= j) {
            if (sc[i++] != sc[j--]) return false;
        } // while

        return true;
    } // isPalindrome
} // Solution