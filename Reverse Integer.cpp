#include<iostream>
using namespace std;

class Solution {
    public:
        static int reverse(int x) {
            long long res = 0;
            bool isPositive = true;
            if (x < 0){
                isPositive = false;
                x *= -1;
            }

            while (x > 0){
                res = res * 10 + x % 10;
                x /= 10;
            }
            if (res > INT_MAX) return 0;
            if (isPositive) return res;
            else return -res;
        }
        int reverse2(int x) {
            int res = 0;
            while (x != 0) {
                // why not need to check "=" ?
                if (abs(res) > INT_MAX / 10) return 0;
                res = res * 10 + x % 10;
                x /= 10;
            }
            return res;
        }
};
