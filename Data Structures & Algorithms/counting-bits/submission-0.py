class Solution:
    def countBits(self, n: int) -> List[int]:
        freq = []
        for i in range(n + 1):
            num = i
            count = 0
            while num > 0:
                if num % 2 != 0:
                    count += 1
                num //= 2
            freq.append(count)
        return freq