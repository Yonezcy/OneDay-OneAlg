// leetcode 413 problem
// 求数组中算数切片（等差数列且数的个数不小于3）的数量

// Mathematic Solution.
class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int curr = 0, sum = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i-1] == A[i-1] - A[i-2]) {
                curr += 1;
                sum += curr;
            }
            else curr = 0;
        }
        return sum;
    }
}

// DP Solution.
class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length;
        if (n < 3) return 0;
        // dp[i] represent the number of slices which are ended in i.
        int dp[] = new int[n];
        if (A[2] - A[1] == A[1] - A[0]) dp[2] = 1;
        int sum = dp[2];
        for (int i = 3; i < n; i++) {
            if (A[i] - A[i-1] == A[i-1] - A[i-2])
                // 1,2,3,4  dp[2] = (1,2,3) = 1  dp[3] = (1,2,3)append'4' + (2,3,4) = 2 ... dp[i] = dp[i-1] + 1
                dp[i] = dp[i-1] + 1;
            sum += dp[i];
        }
        return sum;
    }
}