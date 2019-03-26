// leetcode 415 problem
// 求两个string类型的整形数相加后的结果（开头没有leading zeros）

class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = 0;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            sum += carry; 
            carry = sum / 10;
            sum = sum % 10;
            res.append(sum);
        }
        return res.reverse().toString();
    }
}