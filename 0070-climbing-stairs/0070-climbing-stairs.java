class Solution {
    public int climbStairs(int n) {
        return fibonacci(n);
    }

    private int fibonacci(int n) {
        int fib = 0;
        int a = 1;

        for (int i = 0; i <= n; i++) {
            int temp = fib;
            fib += a;
            a = temp;
        } // for

        return fib;
    } // fibonacci
}