// 求字符数组中回文子序列的个数

// dp[i][j]: the number of subsquence in (i, j)
// State transition:
// dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1]  if（str[i] != str[j]）
// dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1] + dp[i+1][j-1] + 1 = dp[i+1][j] + dp[i][j-1] + 1  if (str[i] == str[j]）
// Initialization: dp[i][i] = 1

public class Solution {
    public int longestPalindromeSubseq(String s) {
        if (s.length() == 0) return 0; 
        int[][] dp = new int[s.length()][s.length()];
        
        for (int i = s.length()-1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] + 1;
                } else {
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
                }
            }
        }
        return dp[0][s.length()-1];
    }
}