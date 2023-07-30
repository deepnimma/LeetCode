class Solution {
    public int searchInsert(int[] nums, int target) {
        return bSearch(nums, target, 0, nums.length - 1);
    }

    private int bSearch(int[] nums, int key, int low, int high) {
        int mid = low + ((high - low) / 2);
        System.out.println(mid);

        if (high <= low) {
            System.out.println(high + " " + low);
            return nums[low] < key ? low + 1 : low;
        }


        if (key == nums[mid])
            return mid;
        else if (key < nums[mid])
            return bSearch(nums, key, low, mid - 1);
        else if (key > nums[mid])
            return bSearch(nums, key, mid + 1, high);

        return -1;
    }
}