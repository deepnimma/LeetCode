class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check rows
        for (int i = 0; i < board.length; i++) {
            if (!checkList(String.valueOf(board[i]))) {
                return false;
            } // if
        } // for

        List<String> lsb = new ArrayList<>();
        // check columns
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder(9);

            for (int j = 0; j < board.length; j++) {
                sb.append(board[j][i]);
            } // for

            if (!checkList(sb.toString()))
                return false;

            lsb.add(sb.toString());
        } // for

        // check boxes
        for (int i = 0; i < board.length - 2; i += 3) {
            for (int j = 0; j < board.length - 2; j += 3) {
                StringBuilder nsb = new StringBuilder(9);

                nsb.append(lsb.get(j).substring(i, i + 3));
                nsb.append(lsb.get(j + 1).substring(i, i + 3));
                nsb.append(lsb.get(j + 2).substring(i, i + 3));

                System.out.println(nsb.toString());

                if (!checkList(nsb.toString()))
                    return false;
            } // for
        } // for


        return true;
    } // isValidSudoku

    private boolean checkList(String row) {
        Map<Character, Integer> a = new HashMap<>();

        for (int i = 0; i < row.length(); i++) {
            if (row.charAt(i) != '.' && a.containsKey(row.charAt(i)))
                return false;
            else
                a.put(row.charAt(i), 1);
        }

        return true;
    } // checkList
} // Solution