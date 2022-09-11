class Solution {
    public int countOdds(int low, int high) {
        int count = 0;

        count = (high - low) / 2;

        if(low % 2 == 0 && high % 2 == 0) {
            return count;
        } // if

        return count + 1;

    } // countOdds
} // Solution