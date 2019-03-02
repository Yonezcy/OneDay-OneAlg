// leetcode 494 problem
// 找出数组中经过加减组合后和为target的种类的数量

// 转换为找出数组中和为target‘的序列数（01背包问题）
// Let P be the positive subset and N be the negative subset.
// The original problem has been converted to a subset sum problem as follows:
// Find number of subset P of nums such that sum(P) = (target + sum(nums)) / 2.

class Solution {
    public int findTargetSumWays(int[] nums, int s) {
        int sum = 0;
        for (int n : nums) 
            sum += n;
        return sum < s || (s+sum) % 2 > 0 ? 0 : subsetSum(nums, (s+sum) >>> 1); 
    }   

    // 经典01背包解法，背下来，还有一种是用二维数组的dp[i][j] = dp[i-1][j] || dp[i-1][i-nums[i]]
    public int subsetSum(int[] nums, int s) {
        int[] dp = new int[s+1]; 
        dp[0] = 1;
        for (int n : nums)
            for (int i = s; i >= n; i--)
                dp[i] += dp[i-n]; 
        return dp[s];
    } 
}