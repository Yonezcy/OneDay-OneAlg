// leetcode 258 problem
// 将一个整形数的各位循环相加，直到结果为一位数为止

// Output sequence for decimals (b = 10):
// input: 0 1 2 3 4 ...
// output: 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 ...

// O(1) Solution.
class Solution {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}

// Recursive Solution.
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