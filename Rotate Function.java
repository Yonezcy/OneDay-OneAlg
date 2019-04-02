// leetcode 396 problem
// Rotate Function

// Mathematical Solution
class Solution {
    public int maxRotateFunction(int[] A) {
        int allSum = 0;
        int len = A.length;
        int F = 0;
        for (int i = 0; i < len; i++) {
            F += i * A[i];
            allSum += A[i];
        }
        int max = F;
        for (int i = len-1; i >= 1; i--) {
            F = F + allSum - len * A[i];
            max = Math.max(F, max);
        }
        return max;
    }
}

// Naive Methods(exhausted search)
class Solution {
    public int maxRotateFunction(int[] A) {
        if (A.length == 0) return 0;
        int[] nums = new int[A.length];
        int maxSum = Integer.MIN_VALUE;
        for (int k = 0; k < A.length; k++) {
            int sum = 0;
            nums = rotateArray(A, k);
            for (int i = 0; i < A.length; i++) {
                sum += i * nums[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    private int[] rotateArray(int[] A, int k) {
        reverse(A, 0, A.length-1);
        reverse(A, 0, k-1);
        reverse(A, k, A.length-1);
        return A;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
