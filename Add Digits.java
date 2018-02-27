// leetcode 258 problem
// 将一个整形数的各位循环相加，直到结果为一位数为止

class Solution {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}