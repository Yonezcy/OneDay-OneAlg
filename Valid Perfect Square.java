// leetcode 367 problem
// 判断一个数是不是某个数的平方

class Solution {
    public boolean isPerfectSquare(int num) {
        long x = num;
        // 牛顿法 判断一个解x^2 - n = 0
        // 迭代Xk+1 = 1/2 * (Xk + n/Xk) 直到abs(Xk+1 - Xk) < 0 判断Xk+1 * Xk+1 == num
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }
}

class Solution {
	public boolean isPerfectSquare(int num) {
		// 平方数都是由奇数相加得到1+3+5+7+...
	    int i = 1;
	    while (num > 0) {
	        num -= i;
	        i += 2;
	    }
	    return num == 0;
	}
}