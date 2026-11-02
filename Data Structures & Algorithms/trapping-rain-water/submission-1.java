class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            int maxLeft = height[i];
            int maxRight = height[i];

            for (int j = 0; j < i; j++) {
                maxLeft = Math.max(maxLeft, height[j]);
            }

            int n = height.length;

            for (int j = i + 1; j < n; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }

            int waterAtI = Math.min(maxLeft, maxRight) - height[i];
            totalWater += waterAtI;
        }
        return totalWater;
    }
}
