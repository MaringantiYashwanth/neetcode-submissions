class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for i in range(nums):
            if bitmask & (1 << nums[i]):
                return num
            else:
                bitmask |= (1 << nums[i])