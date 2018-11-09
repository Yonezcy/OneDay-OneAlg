// leetcode 507 problem
// 判断一个数是否是perfect number(除了本身的所有因子之和为它本身)

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) return false;
        int sum = 0;
        // 只用判断一半，减少时间复杂度
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                // 防止6*6 = 36，6被重复加的情况
                if (i * i != num) {
                    sum += num / i;
                }

            }
        }
        // 去掉num本身
        return sum - num == num;
    }
}