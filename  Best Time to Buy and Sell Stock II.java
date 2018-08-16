// leetcode 122th problem
// 给定一个数组，找出多组后数减前数的差的最大和

class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length-1; i++) {
        	// Given an array 1 3 2 4   (3-1)+(4-2)>(4-1) because 3>2
            if (prices[i+1] > prices[i]) total += prices[i+1] - prices[i];
        }
        return total;
    }
}