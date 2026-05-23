class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()
        while n not in seen:
            seen.add(n)
            arr = [int(digit) for digit in str(n)]
            n = sum(x * x for x in arr)
            if n == 1:
                return True
        return False
        