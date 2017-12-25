// leetcode 322 problem
// 给定一个总和和若干整数，求它们相加得到总和用到的的最少个数

// DP and recursive solution(time limit exceeded)
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int n = Integer.MAX_VALUE;
        for (int coin: coins) {
            int curr = 0;
            if (coin <= amount) {
                int next = coinChange(coins, amount-coin);
                if (next >= 0) 
                    curr = next + 1;
            }
            if (curr > 0) 
                n = Math.min(n, curr);
        }
        int finalCount = (n == Integer.MAX_VALUE) ? -1 : n;
        return finalCount;
    }
}

// 利用map把中间的过程存储起来，用空间换时间，减少时间复杂度
public class Solution {
    Map<Integer,Integer> amountDict = new HashMap<Integer,Integer>();
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amountDict.containsKey(amount))
            return amountDict.get(amount);
        int n = Integer.MAX_VALUE;
        for(int coin: coins) {
            int curr = 0;
            if (amount >= coin) {
                int next = coinChange(coins, amount-coin);
                if(next >= 0)
                    curr = 1 + next;
            }
            if(curr > 0)
                n = Math.min(n,curr);
        }
        int finalCount = (n == Integer.MAX_VALUE) ? -1 : n;
        amountDict.put(amount, finalCount);
        return finalCount;
    }
}