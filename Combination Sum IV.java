// leetcode 377 problem
// 给定一个target，找出数组中和为target的所有可能组合的个数

// Recursive and DP Solution(top down).
class Solution {
    private int[] dp;

    public int combinationSum4(int[] nums, int target) {
        dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(nums, target);
    }

    private int helper(int[] nums, int target) {
        if (dp[target] != -1) return dp[target];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += helper(nums, target-nums[i]);
            }
        }
        dp[target] = res;
        return res;
    }
}

// Bottom up Solution.
public int combinationSum4(int[] nums, int target) {
    int[] comb = new int[target+1];
    comb[0] = 1;
    for (int i = 1; i < comb.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if (i - nums[j] >= 0) {
                comb[i] += comb[i-nums[j]];
            }
        }
    }
    return comb[target];
}