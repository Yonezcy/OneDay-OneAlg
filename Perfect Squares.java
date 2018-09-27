// leetcode 279 problem
// 找出一个数能被分解成平方数的和的最小平方数的数量

class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        for (int i = 1; i < n+1; i++) {
            int k = 1;
            int min = Integer.MAX_VALUE;;
            while (i - k * k >= 0) {
                // 状态转移方程: dp[i] = min(dp[j]+1, min) for j=[1, i-k^2]
                min = Math.min(dp[i-k*k]+1, min);
                k++;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}