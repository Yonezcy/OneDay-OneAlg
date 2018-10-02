// leetcode 322 problem
// 给定一个总和和若干整数，求它们相加得到总和用到的的最少整数个数（可以重复取数）

// O(n*amount) time solution.
class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        // A代表得到和i需要coins中整数的个数
        vector<int> A(amount+1, amount+1);
        A[0] = 0;
        // 对于每个coin，更新A[coin]之后的项
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                A[i] = min(A[i], A[i-coin] + 1);
            }
        }
        return A[amount] > amount ? -1 : A[amount];
    }
};