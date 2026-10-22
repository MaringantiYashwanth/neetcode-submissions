class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 1
        for num in nums:
            result ^= nums
        return result