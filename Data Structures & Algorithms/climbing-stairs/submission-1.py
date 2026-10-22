class Solution:
    def climbStairs(self, n: int) -> int:
        return self.dfs(n, 0)
    def dfs(self, n, i):
        if i == n:
            return 1
        if i >= n:
            return 0
        return self.dfs(n, i + 1) + self.dfs(n, i + 2)
        