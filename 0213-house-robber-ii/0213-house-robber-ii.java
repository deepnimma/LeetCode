class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int max1 = robs(nums, 0, nums.length - 2);
        int max2 = robs(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    } // rob

    private int robs(int[] nums, int start, int end) {
        int t1 = 0, t2 = 0;

        for (int i = start; i <= end; i++) {
            int temp = t1;
            int curr = nums[i];
            t1 = Math.max(curr + t2, t1);
            t2 = temp;
        } // for

        return t1;
    } // robs
} // Solution