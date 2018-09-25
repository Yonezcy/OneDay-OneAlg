// leetcode 258 problem
// 将一个整形数的各位循环相加，直到结果为一位数为止

"""
Output sequence for decimals (b = 10):
input: 0 1 2 3 4 ...
output: 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 ...

Formular:
    a*10^2 + b*10^1 + c*1 === a*1 + b*1 + c*1 === a + b + c(mod 9) === ...

To generalize the concept of digital roots to other bases b, one can simply change the 9 
in the formula to b - 1.
""" 

// O(1) Solution.
class Solution {
    public int addDigits(int num) {
        // The same as num % 9, but we need to avoid num % 9 == 0, that is, num = 9, 18, 27...
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