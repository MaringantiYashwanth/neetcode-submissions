class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            for j in range(i, len(nums) - 1):
                if nums[i] == nums[j+1]:
                    return True

        return False