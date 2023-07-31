class Solution {
    public int fib(int n) {
        return abc(n);
    }

    private int abc(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return abc(n - 1) + abc(n - 2);
    }
}