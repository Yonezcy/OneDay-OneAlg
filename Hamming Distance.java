// leetcode 461 problem
// 求两个数的二进制表示不同的位数

class Solution {
    public int hammingDistance(int x, int y) {
        int dist = 0, n = x ^ y;
        while (n > 0) {
            dist++;
            n &= n - 1;
        }
        return dist;
    }
}