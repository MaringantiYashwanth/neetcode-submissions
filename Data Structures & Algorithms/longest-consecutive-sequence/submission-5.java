class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> numSet = Arrays.stream(nums)
                                .boxed().collect(Collectors.toSet());
        for (int num : nums) {
            while (!numSet.contains(num - 1)) {
                if (numSet.contains(num + length)) {
                    length++;
                }
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
