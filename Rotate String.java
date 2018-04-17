// leetcode 796 problem
// 判断一个字符串是否由另一个旋转得到（将最左边的n个字符移动到最右边）

// 只需判断b是否被包含在a+a中

class Solution {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}