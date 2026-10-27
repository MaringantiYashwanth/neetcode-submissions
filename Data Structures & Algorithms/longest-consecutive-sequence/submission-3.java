class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }
        int curr = 0, streak = 0, res = 0;
        for (int num : nums) {
            curr = num;
            while (streak.contains(num)) {
                streak++;
                curr++;
            }
            Math.max(res, streak);
        }
        return res;
    }
}
