class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i] == 0) {
                int j = i + 1;

                while (j < nums.length && nums[j] == 0) j++;

                if (j < nums.length) {
                    int temp = nums[j];
                    nums[i] = nums[j];
                    nums[j] = 0;
                } // if
            } // if

            i++;
        } // while
    } // moveZeroes
} // Solution