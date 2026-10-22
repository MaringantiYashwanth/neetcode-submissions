class Solution {
    private int dfs(int i, int[] cost) {
        int n = cost.length;
        if (i >= n) {
            return 0;
        }
        return cost[i] + Math.min(dfs(i + 1, cost), dfs(i + 2, cost));


    }
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(dfs(0, cost), dfs(1, cost));
    }
}
