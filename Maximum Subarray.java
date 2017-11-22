class Solution {
    public int maxSubArray(int[] nums) {
        int preSum, totalSum;
        preSum = totalSum = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (preSum < 0) preSum = nums[i];
            else preSum += nums[i];
            if (preSum > totalSum) totalSum = preSum;
        }
        return totalSum;
    }
}