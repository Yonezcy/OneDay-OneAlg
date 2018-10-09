// leetcode 367 problem
// 判断一个数是不是某个数的平方

// 牛顿法 判断一个解x^2 - n = 0
// 迭代Xk+1 = 1/2 * (Xk + n/Xk) 直到abs(Xk+1 - Xk) < 0 判断Xk+1 * Xk+1 == num
// Converges quadratically to sqrt(n) as k->infinity.
// Can prove that intialization value x = num, it will stop as soon as |xk-xk+1|<1 to ensure |xk+1|=floor(sqrt(n)).
class Solution {
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }
}

// 平方数都是由奇数相加得到1+3+5+7+...
class Solution {
	public boolean isPerfectSquare(int num) {
	    int i = 1;
	    while (num > 0) {
	        num -= i;
	        i += 2;
	    }
	    return num == 0;
	}
}

// Binary Search Solution.
public boolean isPerfectSquare(int num) {
    int low = 1, high = num;
    while (low <= high) {
        long mid = (low + high) >>> 1;
        if (mid * mid == num) {
            return true;
        } else if (mid * mid < num) {
            low = (int)mid + 1;
        } else {
            high = (int)mid - 1;
        }
    }
    return false;
}