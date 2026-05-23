class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        # optimal Math approach
        n = len(nums)
        actual_sum = sum(nums)
        expected_sum = n * (n + 1) // 2
        return expected_sum - actual_sum