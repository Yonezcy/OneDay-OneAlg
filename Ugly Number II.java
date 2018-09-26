// leetcode 264 problem
// 寻找ugly number序列中第n个数（ugly number指整数中质因子只有2或3或5的数）

// DP Solution.
// k[1] = min(k[0]x2, k[0]x3, k[0]x5). The answer is k[0]x2. So we move 2's pointer to 1. Then we test:
// k[2] = min(k[1]x2, k[0]x3, k[0]x5). And so on. Be careful about the cases such as 6, 
// in which we need to forward both pointers of 2 and 3.
// Summary: k[n] = min(k[t1]x2, k[t2]x3, k[t3]x5) if k[n] == k[ti]xi: ti++; n++;

class Solution {
public:
    int nthUglyNumber(int n) {
        if(n <= 0) return false; // get rid of corner cases 
        if(n == 1) return true; // base case
        int t2 = 0, t3 = 0, t5 = 0; // pointers for 2, 3, 5
        vector<int> k(n);
        k[0] = 1;
        for (int i = 1; i < n; i++) {
            k[i] = min(k[t2]*2, min(k[t3]*3, k[t5]*5));
            if(k[i] == k[t2] * 2) t2++; 
            if(k[i] == k[t3] * 3) t3++;
            if(k[i] == k[t5] * 5) t5++;
        }
        return k[n-1];
    }
};