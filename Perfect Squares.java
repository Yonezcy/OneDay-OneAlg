class Solution {
    // leetcode279 dp解法
    public int numSquares(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            int k = 1;
            int min = Integer.MAX_VALUE;;
            while (i - k * k >= 0) {
                // 状态转移方程: dp[i] = min(dp[i-j*j]+1, min)
                min = Math.min(dp[i-k*k] + 1, min);
                k++;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}