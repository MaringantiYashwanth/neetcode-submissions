class Solution:
    def countBits(self, n: int) -> List[int]:
        cntList = []

        for i in range(n + 1):
            x = i
            count = 0
            while x > 0:
                count += x & 1
                x >>= 1
            cntList.append(count)
        return cntList