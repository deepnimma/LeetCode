class Solution {
    public String addSpaces(String s, int[] spaces) {
        int spaceIndex = 0, i = 0, n = s.length();
        StringBuilder sb = new StringBuilder();

        while (i < n) {
            if (spaceIndex >= spaces.length) {
                sb.append(s.substring(i, n));
                break;
            } else if (i == spaces[spaceIndex]) {
                sb.append(" ");
                spaceIndex++;
            } else {
                sb.append(s.charAt(i++));
            } // if
        } // while

        return sb.toString();
    } // addSpaces
} // Solution