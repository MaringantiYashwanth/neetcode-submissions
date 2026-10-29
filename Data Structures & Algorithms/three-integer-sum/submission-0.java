class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) 
                {
                    if ((nums[i] + nums[j] + nums[k] == 0)) {
                        List<Integer> triplets = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                       Collections.sort(triplets);
                        set.add(triplets);
                    }
                }
            }
        }

        for (List<Integer> element: set) {
            result.add(element);
        }
        return result;
    }
}
