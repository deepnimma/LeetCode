class Solution {
    public int singleNumber(int[] nums) {
        // LINEAR?
        int a = 0;
        for (int c : nums)
            a ^= c;

        return a;
    }
}