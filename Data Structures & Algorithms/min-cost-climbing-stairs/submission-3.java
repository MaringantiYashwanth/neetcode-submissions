class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(dfs(cost, 0), dfs(cost, 1));
    }

    private int dfs(int[] cost, int i) {
        int n = cost.length;
        int[] memo = new int[n];
        if (i >= cost.length) {
            return 0;
        }
        memo[i] = cost[i] + Math.min(dfs(cost, i + 1), dfs(cost, i + 2));
        return memo[i];
    }
}
