class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 1; i <= numbers.length - 1; i++) {
            int complement = target - numbers[0];
            if (mp.containsKey(complement)) {
                return new int[]{mp.get(complement), i};
            }
            mp.put(numbers[i], i);
        }
        return new int[]{};
    }
}
