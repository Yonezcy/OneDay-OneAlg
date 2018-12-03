// leetcode 718 problem
// 求两个数组的最长公共子串的长度

class Solution {
    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m == 0 || n == 0) return 0;
        int max = 0;
        // dp[i][j] is the length of longest common subarray ending with nums[i] and nums[j].
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else {
                    if (A[i-1] == B[j-1]) {
                        dp[i][j] = 1 + dp[i-1][j-1];
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }
        }
        return max;
    }
}