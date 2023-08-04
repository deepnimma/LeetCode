class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        } // for

        int[] a = new int[k];

        for (int i = 0; i < k; i++) {
            a[i] = getMostFrequent(map);
            map.replace(a[i], -1);
        } // for

        System.out.println(map.values());
     
        return a;
    } // topKFrequent

    int getMostFrequent(Map<Integer, Integer> map) {
        int mostFrequent = Integer.MIN_VALUE;
        int freq = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > freq) {
                mostFrequent = entry.getKey();
                freq = entry.getValue();
            } // if
        } // for

        return mostFrequent;
    }
} // Solution