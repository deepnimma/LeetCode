class Solution {
    public double average(int[] salary) {
        // Sorting the salary
        if(salary.length <= 2) {
            return 0;
        } // if
    
        sort(salary);

        long sum = 0;

        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        } // if

        double dSum = (float) sum;
        double divisor = (float) salary.length - 2;

        return dSum / divisor;
    }

    private void sort(int[] myArr) {
        int n = myArr.length;

        for (int i = 1; i < n; i++) {
            int key = myArr[i];
            int j = i - 1;

            while (j >= 0 && myArr[j] > key) {
                myArr[j + 1] = myArr[j];
                j = j - 1;
            }
            myArr[j + 1] = key;
        }
    }
}