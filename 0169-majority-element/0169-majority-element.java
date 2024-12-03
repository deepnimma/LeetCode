class Solution {
    public int majorityElement(int[] nums) {
        int freq = -1, num = -1;
        Map<Integer, Integer> cnt = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            cnt.put(n, cnt.getOrDefault(n, 0) + 1);

            if (cnt.get(n) > freq) {
                freq = cnt.get(n);
                num = n;
            } // if
        } // for

        return num;
    } // majorityElement
} // Solution