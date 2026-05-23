class Solution:
    def countBits(self, n: int) -> List[int]:
        freq = [0 for _ in range(n + 1)]
        for i in range(n + 1):
            freq[i] = freq[i >> 1] + (i & 1)
        return freq