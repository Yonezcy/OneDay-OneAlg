// leetcode 7 problem
// 将一个整形数翻转(考虑溢出)

class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            // 溢出前后结果就会不相等
            if ((newResult - tail) / 10 != result) 
                return 0;
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}