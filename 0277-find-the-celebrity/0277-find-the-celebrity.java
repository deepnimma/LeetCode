/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        Map<Integer, List<Integer>> knowmap = new HashMap<>();

        for (int i = 0; i < n; i++) knowmap.put(i, new ArrayList<>());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                else if (knows(i, j)) {
                    knowmap.get(i).add(j);
                } // if-else if
            } // for
        } // for

        for (int k : knowmap.keySet()) {
            if (knowmap.get(k).size() == 0) return k;
        } // for

        return -1;
    } // findCelebrity
} // Solution