// leetcode 476 problem
// 求一个数的补数（二进制各位取反）

class Solution {
public:
    int findComplement(int num) {
        unsigned mask = ~0;
        while (num & mask) mask <<= 1;
        return ~mask & ~num;
    }
};