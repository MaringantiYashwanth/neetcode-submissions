class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        j = 0
        for i in range(len(nums)):
            if nums[i] != j:
                return j
            j += 1
        return j