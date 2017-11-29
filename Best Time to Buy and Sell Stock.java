// leetcode 121th problem
// Say you have an array for which the ith element is the price of a given stock on day i.
// If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
// Kadane Solution
class Solution {
    public int maxProfit(int[] prices) {
        int curSum = 0, soFarSum = 0;
        for (int i=1; i<prices.length; i++) {
            curSum = Math.max(0, curSum += (prices[i]-prices[i-1]));
            soFarSum = Math.max(curSum, soFarSum);
        }
        return soFarSum;
    }
}