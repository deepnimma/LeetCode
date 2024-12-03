class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        List<List<Character>> zz = new ArrayList<>();

        // Add empty lists
        for (int i = 0; i < numRows; i++) {
            zz.add(new ArrayList<>());
        } // for

        boolean backwards = false;
        int i = 0;
        int row = 0;

        while (i < s.length()) {
            System.out.println(s.charAt(i) + " " + row);

            if (backwards) {
                zz.get(row--).add(s.charAt(i++));
                if (row <= 0) {
                    row = 0;
                    backwards = false;
                } // if
                continue;
            } // if

            zz.get(row++).add(s.charAt(i++));
            if (row >= numRows) {
                if (numRows == 2) {
                    row = 0;
                    continue;
                } // if

                row = numRows - 2;
                backwards = true;
            } // if
        } // while

        StringBuilder sb = new StringBuilder();

        for (List<Character> l : zz) {
            for (Character c : l) {
                sb.append(c);
            } // for
        } // for

        return sb.toString();
    } // convert
} // Solution