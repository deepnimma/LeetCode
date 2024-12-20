class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int currTemp = temperatures[i];

            while (!stack.isEmpty() && temperatures[stack.peek()] < currTemp) {
                int prev = stack.pop();
                ans[prev] = i - prev;
            } // while

            stack.push(i);
        } // for

        return ans;
    } // dailyTemperatures
} // Solution