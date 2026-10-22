class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for i, num in enumerate(nums):
            if bitmask & (1 >> num):
                return bitmask
            else:
                bitmask |= (1 << num)
        return 0