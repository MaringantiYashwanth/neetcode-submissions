class Solution:
    def hammingWeight(self, n: int) -> int:
        count = 0
        print(n)
        while (n > 0):
            count += n & 1
            n >>= 1
        return count