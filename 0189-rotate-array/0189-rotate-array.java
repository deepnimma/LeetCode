class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // k > len

        int piv = nums.length - k;

        int i = 0, j = piv - 1;

        while (i < j) nums = swap(nums, i++, j--);

        i = piv;
        j = nums.length - 1;

        while (i < j) nums = swap(nums, i++, j--);

        i = 0;
        j = nums.length - 1;

        while (i < j) nums = swap(nums, i++, j--);
    } // rotate

    private int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return nums;
    } // swap
} // Solution