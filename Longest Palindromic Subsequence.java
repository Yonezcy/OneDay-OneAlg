// leetcode 516 problem
// 求最大回文子序列的长度

// dp[i][j]: the longest palindromic subsequence’s length of substring(i, j)
// State transition:
// if s.charAt(i) == s.charAt(j) dp[i][j] = dp[i+1][j-1] + 2
// otherwise, dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1])
// Initialization: dp[i][i] = 1


// i--, j++
public class Solution {
    public int longestPalindromeSubseq(String s) {
        if (s.length() == 0) return 0; 
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length()-1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) 
                    dp[i][j] = dp[i+1][j-1] + 2;
                else 
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                
            }
        }
        return dp[0][s.length()-1];
    }
}

// i++, j--
public class Solution {
    public int longestPalindromeSubseq(String s) {
        if (s.length() == 0) return 0; 
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            for (int j = i-1; j >= 0; j--) {
                if (s.charAt(j) == s.charAt(i)) 
                    dp[j][i] = dp[j+1][i-1] + 2;
                else 
                    dp[j][i] = Math.max(dp[j+1][i], dp[j][i-1]);
                
            }
        }
        return dp[0][s.length()-1];
    }
}


