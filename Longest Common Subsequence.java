// Longest Common Subsequence

class Solution {
    public int findLength(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return 0;
        // dp[i][j] is the max length of longest common subsequence ending with A[i-1] and B[j-1].
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= t.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else {
                    if (s.charAt(i-1) == t.charAt(j-1))
                        dp[i][j] = dp[i-1][j-1] + 1;
                    else
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[s.length()+1][t.length()+1];
    }
}