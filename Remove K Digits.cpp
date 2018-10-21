// leetcode 402 problem
// 在字符串中移除k个字符，使得余下的字符组成的数最小

// Straight-forward O(k*n) Solution.
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

// O(n) Solution(using stack).
class Solution {
public:
    string removeKdigits(string num, int k) {
        string res;
        int keep = num.size() - k;
        for (int i = 0; i < num.size(); i++) {
            while (res.size() > 0 && res.back() > num[i] && k > 0) {
                res.pop_back();
                k--;
            }
            res.push_back(num[i]);
        }
        // prevent only 1 char case
        res.erase(keep, string::npos);
        // trim leading zeros
        int s = 0;
        while (s < (int)res.size()-1 && res[s] == '0') s++;
        res.erase(0, s);
        return res == "" ? "0" : res;
    }
};