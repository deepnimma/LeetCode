class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int newArea = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(newArea, maxArea);

            if (height[i] == height[j]) {
                i++;
                j--;
            } else if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        } // while

        return maxArea;
    } // maxArea
} // Solution