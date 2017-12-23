// leetcode 343 problem
// 将一个整数分解为若干整数乘积，求最大乘积

// Math Solution
// 可以证明：3是最理想的乘积因子 https://leetcode.com/problems/integer-break/discuss 第二个解法
class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int product = 1;
        while (n > 4) {
            product *= 3;
            n -= 3;
        }
        product *= n;
        return product;
    }
}

// DP Solution
public int integerBreak(int n) {
    int[] dp = new int[n + 1];
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
        for (int j = 1; j < i; j++) {
           dp[i] = Math.max(dp[i], Math.max(j, dp[j]) * Math.max(i - j, dp[i - j]));
       }
   }
   return dp[n];
}