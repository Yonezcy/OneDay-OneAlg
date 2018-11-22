// leetcode 581 problem
// 找出一个数组的最短子串使得子串排序后整个数组呈升序

// In here, total six solutions for this question. 
// Each solution happens in time complexity descending order.


// Solution 1: Brute forth.
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j <= nums.length; j++) {
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, prev = Integer.MIN_VALUE;
                for (int k = i; k < j; k++) {
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
                if ((i > 0 && nums[i - 1] > min) || (j < nums.length && nums[j] < max))
                    continue;
                int k = 0;
                while (k < i && prev <= nums[k]) {
                    prev = nums[k];
                    k++;
                }
                if (k != i)
                    continue;
                k = j;
                while (k < nums.length && prev <= nums[k]) {
                    prev = nums[k];
                    k++;
                }
                if (k == nums.length) {
                    res = Math.min(res, j - i);

                }
            }
        }
        return res;
    }
}


// Solution 6: Two pointer trick. O(n) time + O(1) space.
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