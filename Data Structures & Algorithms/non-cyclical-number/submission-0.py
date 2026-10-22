class Solution:
    def isHappy(self, n: int) -> bool:
        n = int(n)
        seen = set()
        while n not in seen:
            arr = [(int(digit)) ** 2 for digit in str(n)]
            n = sum(arr)
            seen.add(n)
            if n == 1:
                return True
        return False
        