// leetcode 53 problem
// 求数组最大子串和

class Solution {
    // 状态转移方程：dp[i] = max(dp[i]+nums[i], nums[i]).
    public int maxSubarray(int[] nums) {
        int preSum = nums[0];
        int totalSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum = Math.max(preSum+nums[i], nums[i]);
            totalSum = Math.max(totalSum, preSum);
        }
        return totalSum;
    }
}

// 只适用于有元素大于等于0的数组
class Solution {
    public int maxSubArray(int a[]) { 
        int maxSum = 0, thisSum = 0; 
        for (int j = 0; j < a.length; j++) {
            thisSum += a[j]; 
            if (thisSum > maxSum) 
                maxSum = thisSum;
            else if (thisSum < 0)
                thisSum = 0;
        }
        return maxSum;
    }
}