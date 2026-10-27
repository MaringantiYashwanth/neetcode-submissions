class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> numSet = Arrays.stream(nums)
                                .boxed().collect(Collectors.toSet());
        for (int num : nums) {
            int length = 0;
            if (!numSet.contains(num - 1)) {
                while (numSet.contains(num + length)) {
                    length++;
                }
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
