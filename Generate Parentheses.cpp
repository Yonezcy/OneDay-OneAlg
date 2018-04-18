// leetcode 22 problem
// 给定正整数n，生成任意排列的完美括号对（右括号在左括号右边）

class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> res;
        addingpar(res, "", n, 0);
        return res;
    }
    void addingpar(vector<string> &v, string str, int n, int m){
        if (n==0 && m==0) {
            v.push_back(str);
            return;
        }
        if (m > 0) addingpar(v, str+")", n, m-1);
        if (n > 0) addingpar(v, str+"(", n-1, m+1);
    }
};