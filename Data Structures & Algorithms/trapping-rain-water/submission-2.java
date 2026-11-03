class Solution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return null;
        }
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int result = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left += 1;
                leftMax = max(leftMax, height[left]);
                result = leftMax - height[left];
            } else {
                right -= 1;
                rightMax = max(rightMax, height[right]);
                result = rightMax - height[right];
            }
        }
        return result
    }
}
