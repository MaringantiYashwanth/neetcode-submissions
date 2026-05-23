class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lookup = {}
        for i in range(len(nums)):
            if lookup.get(target - nums[i]) is not None:
                return [lookup[target - nums[i]], i]
            lookup[nums[i]] = i
            