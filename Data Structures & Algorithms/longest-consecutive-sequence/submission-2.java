class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                result++;
            }
        }
        return nums.length == 0 ? 0 : ++result;
    }
}
