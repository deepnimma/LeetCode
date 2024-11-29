class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums.length == 0) return 0;
        if (k <= 1) return 0;

        int cnt = 0, prod = 1;

        for (int i = 0, j = 0; j < nums.length; j++) {
            prod *= nums[j];

            while (prod >= k) {
                prod /= nums[i++];
            } // while

            cnt += j - i + 1;
        } // for

        return cnt;
    } // numSubarrayProductLessThanK
} // Solution