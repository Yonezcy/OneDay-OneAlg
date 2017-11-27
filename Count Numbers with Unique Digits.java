class Solution {
    // leetcode357 dp解法 计算0-n中各个位上没有重复数字的数的个数
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int res = 10;
        int uniqueDigits = 9;
        int availableNumber = 9;
        while (n > 1 && availableNumber > 0) {
            uniqueDigits = uniqueDigits * availableNumber;
            // 状态转移方程：两位数不重复的数一共有9*9个，三位数9*9*8，四位数9*9*8*7……，最后累加起来即可
            res += uniqueDigits;
            availableNumber--;
            n--;
        }
        return res;
    }
}