// leetcode 405 problem
// 将十进制整形数转换为十六进制字符串

class Solution {
    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    public String toHex(int num) {
        if (num == 0) return "0";
        String result = "";
        while (num != 0) {
            result = map[(num & 15)] + result; 
            // >>> 高位补0；>> 高位补上原来的高位. 左移没有 <<< 因为不存在符号问题
            num = (num >>> 4);
        }
        return result;
    }
}