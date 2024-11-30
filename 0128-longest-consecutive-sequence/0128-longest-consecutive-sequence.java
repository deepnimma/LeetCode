class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0 || n == 1) return n;

        nums = removeDups(nums);
        Arrays.sort(nums);

        n = nums.length;

        int currMax = 1;
        int i = 0, j = 1;
        int diff = -1, rem = 0;

        while (j < n) {
            diff = (nums[j] - nums[i]) / (j - i);
            rem = (nums[j] - nums[i]) % (j - i);

            if (diff == 1 && rem == 0) {
                currMax = Math.max(currMax, j - i + 1);
            } else i++;

            j++;
        } // while

        return currMax;
    } // longestConsecutive

    private int[] removeDups(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for (int i : nums) {
            if (!s.contains(i)) s.add(i);
        } // for

        int[] n = new int[s.size()];
        int r = 0;

        for (int i : s) {
            n[r++] = i;
        } // for

        return n;
    } // removeDups
} // Solution