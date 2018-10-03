// leetcode 336 problem
// 判断一个整型数是否是3的n次方

class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19, 3^20 is bigger than int.
        return (n > 0 && 1162261467%n == 0);
    }
}