class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = ((r - l) / 2) + l;

            if (nums[mid] > nums[nums.length - 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            } // if-else
        } // while

        int ans = binsearch(nums, 0, l - 1, target);
        return (ans == -1) ? binsearch(nums, l, nums.length - 1, target) : ans;
    } // search

    private int binsearch(
        int[] nums,
        int l,
        int r,
        int target
    ) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            } // if-else if-else
        } // while

        return -1;
    } // binsearch
} // Solution