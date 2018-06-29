// leetcode 44 problem
// 实现通配符的匹配机制

'''
1, If p.charAt(j) == s.charAt(i) :  dp[i][j] = dp[i-1][j-1];
2, If p.charAt(j) == '?' : dp[i][j] = dp[i-1][j-1];
3, If p.charAt(j) == '*': 
           dp[i][j] = dp[i-1][j]   // in this case, * counts as character sequence 
        or dp[i][j] = dp[i][j-1]   // in this case, * counts as empty
'''

class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i = 1; i <= m; i++) {
            dp[i][0] = false;
        }

        for (int j = 1; j <= n; j++) {
            if (p.charAt(j-1) == '*')
                dp[0][j] = true;
            else break;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j-1) != '*' && (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?')) {
                    dp[i][j] = dp[i-1][j-1];
                } 
                if (p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}