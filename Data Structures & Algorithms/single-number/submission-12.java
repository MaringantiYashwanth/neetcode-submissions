class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] &= nums[i + 1];
        }
        return nums;
    }
}
