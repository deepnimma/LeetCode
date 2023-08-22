class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i])
                continue;

            if (nums[i + 1] - nums[i] == 1) {
                count++;

                if (i + 1 >= nums.length - 1)
                    return Math.max(maxCount, count);
            } else {
                count = 1;
            } // if-else

            maxCount = Math.max(maxCount, count);
        } // for

        return maxCount;
    } // longestConsecutive
} // Solution