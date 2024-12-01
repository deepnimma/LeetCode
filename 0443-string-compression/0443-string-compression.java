class Solution {
    public int compress(char[] chars) {
        String ans = new String();
        int i = 0;

        while (i < chars.length) {
            int j = i;

            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            } // while

            if (j - 1 == i) ans += chars[i];
            else ans += chars[i] + Integer.toString(j - i);

            i = (i == j) ? i + 1 : j;
        } // while

        char[] cpy = ans.toCharArray();

        for (i = 0; i < cpy.length; i++) chars[i] = cpy[i];
        return cpy.length;
    } // compress
} // Solution