// leetcode 263 problem
// 判断一个数是不是ugly number（ugly number是质因子只有2，3，5的正数）

class Solution {
    public boolean isUgly(int num) {
        for (int i = 2; i < 6 && num > 0; i++)
            while (num % i == 0) {
            	num /= i;
            }
        return num == 1;
    }
}