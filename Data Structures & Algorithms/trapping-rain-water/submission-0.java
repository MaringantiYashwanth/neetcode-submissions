class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            int maxLeft = 0;
            int maxRight = 0;

            for (int j = 0; j <= i; j++) {
                maxLeft = Math.max(maxLeft, height[j]);

            }

            int n = height.length;

            for (int j = i; j <= n - 1; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }

            int waterAtI = Math.min(maxLeft, maxRight) - height[i];
            totalWater += waterAtI;
        }
        return totalWater;
    }
}
