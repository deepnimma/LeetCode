class Solution {
    public int search(int[] nums, int target) {
        return srch(nums, target, 0, nums.length - 1);
    }

    private int srch(int[] nums, int target, int low, int high) {
        if (high < low)
            return -1;

        int mid = low + ((high - low ) / 2);

        if (nums[mid] == target)
            return mid;
        else if (nums[mid] > target) {
            return srch(nums, target, low, mid - 1);
        } else if (nums[mid] < target) {
            return srch(nums, target, mid + 1, high);
        } // if-else

        return -1;
    } // srch
}