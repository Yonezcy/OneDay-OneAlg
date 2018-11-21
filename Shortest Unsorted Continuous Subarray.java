// leetcode 581 problem
// 找出一个数组的最短子串使得子串排序后整个数组呈升序

class Solution {
    public int findUnsortedSubarray(int[] A) {
        int n = A.length, begin = -1, end = -2, min = A[n-1], max = A[0];
        for (int i = 1; i < n; i++) {
          max = Math.max(max, A[i]);
          min = Math.min(min, A[n-1-i]);
          if (A[i] < max) end = i;
          if (A[n-1-i] > min) begin = n - 1 - i;
        }
        return end - begin + 1;
    }
}