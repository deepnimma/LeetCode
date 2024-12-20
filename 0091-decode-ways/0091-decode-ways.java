class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (s == null || n == 0) return 0;

        int[] dp = new int[n + 1];
        dp[0] = 1;

        if (s.charAt(0) == '0') dp[1] = 0;
        else dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            } // if

            int twoDigit = Integer.valueOf(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            } // if
        } // for

        return dp[n];
    } // numDecodings
} // Solution