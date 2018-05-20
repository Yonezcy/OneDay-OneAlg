// leetcode 9 problem
// 判断一个整形数是否是回文数

class Solution {
public:
    bool isPalindrome(int x) {
        // negative integer is not palindrome number!
        return (x >= 0 && reverse(x) == x);
    }
    int reverse(int x) {
        long long res = 0;
        bool isPositive = true;
        if (x < 0) {
            isPositive = false;
            x *= -1;
        }

        while (x > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (res > INT_MAX) return 0;
        if (isPositive) return res;
        else return -res;
    }
};
