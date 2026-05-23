class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        # xor trick
        n = len(nums)
        missing = n
        for i in range(n):
            missing ^= i ^ nums[i]
        return missing
        