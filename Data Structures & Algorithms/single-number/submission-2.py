class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for i in range(len(nums)):
            if bitmask & (1 << nums[i]):
                return nums[i]
            else:
                bitmask |= (1 << nums[i])