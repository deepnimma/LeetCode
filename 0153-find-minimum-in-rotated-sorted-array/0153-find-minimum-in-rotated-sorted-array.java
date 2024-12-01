class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums[nums.length - 1] > nums[0]) return nums[0]; // Array is not rotated.

        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = ((r - l) / 2) + l;

            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
            else if (nums[mid - 1] > nums[mid]) return nums[mid];

            if (nums[mid] > nums[0]) l = mid + 1;
            else if (nums[mid] < nums[0]) r = mid;
        } // while

        return -1;
    } // findMin
} // nums