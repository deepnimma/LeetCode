class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[i] + numbers[j] == target) {
                    int[] a = {i + 1, j + 1};
                    return a;
                } // if
            } // for
        } // for
        
        int[] a = {1, 2};
        return a;
    } // twoSum
} // Solution