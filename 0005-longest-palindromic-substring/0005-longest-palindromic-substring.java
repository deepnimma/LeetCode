class Solution {
    public String longestPalindrome(String s) {
        String ans = new String();
        int ansLen = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > ansLen) {
                    ans = s.substring(l, r + 1);
                    ansLen = r - l + 1;
                } // if

                l--;
                r++;
            } // while

            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > ansLen) {
                    ans = s.substring(l, r + 1);
                    ansLen = r - l + 1;
                } // if

                l--;
                r++;
            } // while
        } // for

        return ans;
    } // longestPalindrome
} // Solution