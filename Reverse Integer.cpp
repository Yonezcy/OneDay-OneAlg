// leetcode 7 problem
// 将一个整形数翻转(考虑溢出)

class Solution {
public:
    static int reverse(int x) {
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

class Solution {
public:
    int reverse(int x) {
        int res = 0;
        while (x != 0) {
            // why do not need to check "="?
            if (abs(res) > INT_MAX / 10) return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
};