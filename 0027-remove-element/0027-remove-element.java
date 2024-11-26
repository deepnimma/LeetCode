class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length - 1;
        int cnt = 0;
        int i = nums.length - 1;
        int temp = -1;

        while (i >= 0) {
            if (nums[i] == val) {
                temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k--;
                cnt++;
            } // if

            i--;
        } // while

        return nums.length - cnt;
    } // removeElement
} // Solution