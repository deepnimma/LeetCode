class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();

        for (int i : nums) {
            cnt.put(i, cnt.getOrDefault(i, 0) + 1);
        } // for

        int[] freq = new int[k];

        for (int i = 0; i < k; i++) {
            freq[i] = getMostFreqElement(nums, cnt);
        } // for

        return freq;
    } // topKFrequent

    private int getMostFreqElement(int[] nums, Map<Integer, Integer> map) {
        int curr = -1, currcnt = -1;
        for (int i : nums) {
            if (map.get(i) > currcnt) {
                curr = i;
                currcnt = map.get(i);
            } // if
        } // for

        map.put(curr, -1);

        return curr;
    } // for
} // Solution