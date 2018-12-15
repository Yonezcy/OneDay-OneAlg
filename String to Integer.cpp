// Leetcode 8 problem
// 把string转换成int(atoi)

class Solution {
public:
    int myAtoi(string str) {
        if (str == "") return 0;
        int i;
        int sign_count = 0;
        long long res = 0;
        int sign = 1;
        int hasDigit = 0;
        for (i = 0; i < str.length(); i++) {
            if (sign_count == 0 && hasDigit == 0) {
                if (str[i] == ' ') continue;
            }
            if (str[i] == '+' || str[i] == '-') {
                if (str[i] == '-') sign = -1;
                sign_count++;
                continue;
            }
            if (sign_count <= 1) {
                if (str[i] >= '0' && str[i] <= '9') {
                    hasDigit = 1;
                    res = res * 10 + (str[i] - '0');
                    if (res > INT_MAX)
                        return sign < 0 ? INT_MIN : INT_MAX;
                }
                else break;
            }
            else return 0;
        }
        if (sign == 1) return (int)res;
        else return (int)-res;
    }
};
