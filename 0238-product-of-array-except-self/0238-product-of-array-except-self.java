class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] ans = new int[n];

        l[0] = 1;
        r[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            l[i] = l[i - 1] * nums[i - 1];
            r[n - i - 1] = r[n - i] * nums[n - i];
        } // for

        for (int i = 0; i < n; i++) ans[i] = r[i] * l[i];

        return ans;
    } // productExceptSelf
} // Solution