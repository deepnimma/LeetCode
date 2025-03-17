class Solution {
    public int search(int[] nums, int target) {
        return binsearch(nums, target, nums.length - 1, 0);
    } // search

    private int binsearch(int[] nums, int target, int high, int low) {
        if (low > high) return -1;
        int mid = (high - low) / 2 + low;
        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) return binsearch(nums, target, high, mid + 1);
        else if (nums[mid] > target) return binsearch(nums, target, mid - 1, low);

        return -1;
    } // binsearch
} // Solution