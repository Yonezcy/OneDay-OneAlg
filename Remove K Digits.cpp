// leetcode 402 problem
// 移除k个数组字符，使得余下的字符组成的数最小

class Solution {
public:
    string removeKdigits(string num, int k) {
        // 每次移除从左往右第一个比右边大的数
        while (k > 0) {
            int n = num.size();
            int i = 0;
            while (i+1 < n && num[i] <= num[i+1]) i++;
            num.erase(i, 1);
            k--;
        }
        // 移除开头的0
        int s = 0;
        while (s < (int)num.size()-1 && num[s] == '0') s++;
        num.erase(0, s);
        return num == "" ? "0" : num;
    }
};