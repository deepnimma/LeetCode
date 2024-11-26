class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];

            if (map.get(c) != null) return new int[] {i, map.get(c)};
            else map.put(nums[i], i);
        } // for

        return new int[] {-1, -1};
    } // twoSum
} // Solution