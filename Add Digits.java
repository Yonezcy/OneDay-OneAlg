// leetcode 258 problem
// 将一个整形数的各位循环相加，直到结果为一位数为止

// O(1) solution
class Solution {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}

// recursive solution
class Solution {
    public int addDigits(int num) {
        if (num % 10 == num) return num;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
}