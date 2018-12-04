// 求两个数组的最长公共子序列的长度(LCS问题)

class Solution {
    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m == 0 || n == 0) return 0;
        // dp[i][j] is the length of longest common subsequence ending with A[i-1] and B[j-1].
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else {
                    if (A[i-1] == B[j-1])
                        dp[i][j] = 1 + dp[i-1][j-1];
                    else
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}