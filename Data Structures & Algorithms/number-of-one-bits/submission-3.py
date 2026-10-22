class Solution:
    def hammingWeight(self, n: int) -> int:
        bitwise = 0
        str1 = str(n)
        for ch in range(len(str1)):
            num = ch
            bitwise |= ( 1 << num )
        return bitwise