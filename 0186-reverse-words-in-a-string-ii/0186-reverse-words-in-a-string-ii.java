class Solution {
    public void reverseWords(char[] s) {
        int i = 0, j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        } // while

        i = 0; j = 0;

        while (i < s.length) {
            while (j < s.length && s[j] != ' ') j++;

            while (i < j - 1) {
                char temp = s[i];
                s[i++] = s[j - 1];
                s[j - 1] = temp;
                j--;
            } // while

            i = j;
            j = j + 1;
        } // while
    } // reverseWords
} // Solution