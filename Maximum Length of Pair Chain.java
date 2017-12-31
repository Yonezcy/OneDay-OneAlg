// leetcode 646 problem
// 找出二维数组中可以形成连续递增序列的一位数组的最大数量

// dp[i]是到第i个一位数组为止的最大数量
// 状态转移方程：dp[i] = max(dp[i], pairs[i][0] > pairs[j][1]? dp[j] + 1 : dp[j]) for j in range(0, i)

class Solution {
    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0) return 0;
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], pairs[i][0] > pairs[j][1]? dp[j] + 1 : dp[j]);
            }
        }
        return dp[pairs.length - 1];
    }
}