// leetcode 121th problem
// 给定一个数组，找出后数减前数的最大差

// Kadane Solution
class Solution {
    public int maxProfit(int[] prices) {
        int curSum = 0, soFarSum = 0;
        for (int i = 1; i < prices.length; i++) {
            curSum = Math.max(0, curSum += (prices[i]-prices[i-1]));
            soFarSum = Math.max(curSum, soFarSum);
        }
        return soFarSum;
    }
}