class Solution {
    public int[] twoSum(int[] nums, int target) {
        // optimized approach:
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (freqMap.containsKey(complement)) {
                return new int[]{ freqMap.get(complement), i};
            }
            freqMap.put(nums[i], i);
        }
        return new int[0];
    }
}
