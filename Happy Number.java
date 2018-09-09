// leetcode 202 problem
// 判断一个数是否是happy number（各个位上的数的平方和循环相加后等于1）

// Solution1: 设置两个快慢游标，循环后都为1即快乐数
class Solution {
    public int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n != 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        // 用两个游标来判断是否可能有其他的循环
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);
        if (slow == 1) return true;
        else return false;
    }
}

// Solution 2: 非快乐数的循环中必定含有4, 他们总是在循环{4,16,37,58,89,145,42,20}中
class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int t = 0;
            while (n != 0) {
                t += (n % 10) * (n % 10);
                n /= 10;
            }
            n = t;
        }
        return n == 1;
    }
}