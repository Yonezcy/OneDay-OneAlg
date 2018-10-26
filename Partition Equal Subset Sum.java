// leetcode 416 problem && Tencent interview problem
// 把一个数组划分为两部分，使两部分的和相等
// 0-1背包问题，dp solution

// dp[i][j] means whether the specific sum j can be gotten from the first i numbers. 
// If we can pick such a series of numbers from 0-i whose sum is j, dp[i][j] is true, otherwise it is false.

// For each number, if we don't pick it, dp[i][j] = dp[i-1][j], which means if the first i-1 elements 
// has made it to j, dp[i][j] would also make it to j (we can just ignore nums[i]). 
// If we pick nums[i]. dp[i][j] = dp[i-1][j-nums[i]], which represents that j is composed of the 
// current value nums[i] and the remaining composed of other previous numbers. Thus, the transition function is 
// dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]]

// Two dimensional dp array.
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if ((sum & 1) == 1) return false;
        sum /= 2;
        
        int n = nums.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], false);
        }
        dp[0][0] = true;
        for (int i = 1; i < n+1; i++) 
            dp[i][0] = true;
        for (int j = 1; j < sum+1; j++) 
            dp[0][j] = false;
        
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (j >= nums[i-1]) {
                    // Notice there is j-nums[i-1] because nums array's index starts from 0.
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[n][sum];
    }
}

// One dimensional dp array.
public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) sum += num;
    if ((sum & 1) == 1) return false;
    sum /= 2;
    
    int n = nums.length;
    boolean[] dp = new boolean[sum+1];
    Arrays.fill(dp, false);
    dp[0] = true;
    
    for (int num : nums) {
        for (int i = sum; i > 0; i--) {
            if (i >= num) {
                dp[i] = dp[i] || dp[i-num];
            }
        }
    }
    return dp[sum];
}