class Solution {
    public int addDigits(int num) {
        return add(num);
    } // addDigits

    private int add(int num) {
        if (num < 10) {
            return num;
        }
        int count = 0;

        while (num > 0) {
            count += num % 10;
            num /= 10;
        }

        return add(count);
    } // add
} // addDigits