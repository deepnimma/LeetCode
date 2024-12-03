class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        for (int[] i : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < i[0]) {
                merged.add(i);
            } else {
                merged.getLast()[1] = Math.max(
                    merged.getLast()[1],
                    i[1]
                );
            } // if-else
        } // for

        return merged.toArray(new int[merged.size()][]);
    } // merge
} // Solution