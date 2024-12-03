class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> s = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i : stones) s.offer(i);

        while (s.size() > 1) {
            int x = s.poll();
            int y = s.poll();

            if (x != y) s.offer(x - y);
        } // while

        return s.size() == 0 ? 0 : s.poll();
    } // lastStoneWeight
} // Solution