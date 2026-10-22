class Solution {
    public int longestConsecutive(int[] nums) {
        // nums = [2, 20, 4, 10, 3, 4, 5];  output: 4
        // nums = [0, 3, 2, 5, 4, 6, 1, 1]; output: 7
        Arrays.sort(nums);
        int max = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == (nums[i - 1] + 1)) {
                count++;
            }
           max = Math.max(max, count);
        }
        return max + 1;
    }
}
