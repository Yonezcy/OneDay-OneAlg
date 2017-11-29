// leetcode 122th problem
// Say you have an array for which the ith element is the price of a given stock on day
// Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
// (ie, buy one and sell one share of the stock multiple times). 
// However, you may not engage in multiple transactions at the same time 
// (ie, you must sell the stock before you buy again).

class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i<prices.length-1; i++) {
        	// Given an array 1 3 2 4   (3-1)+(4-2)>(4-1) because 3>2
            if (prices[i+1]>prices[i]) total += prices[i+1] - prices[i];
        }
        return total;
    }
}