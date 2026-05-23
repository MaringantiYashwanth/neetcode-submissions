class Solution:
    def hammingWeight(self, n: int) -> int:
        binary = bin(n)
        count = 0
        for num in (binary[::-1]):
            if num == "1":
                count += 1
        return count