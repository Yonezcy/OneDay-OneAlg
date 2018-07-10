// leetcode 53 problem
// 求数组最大子序列和

class Solution {
    public int maxSubArray(int[] nums) {
        int preSum, totalSum;
        preSum = totalSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (preSum < 0) preSum = nums[i];
            else preSum += nums[i];
            if (preSum > totalSum) totalSum = preSum;
        }
        return totalSum;
    }
}

// 只适用于非0数组
class Solution{
    public int maxSubArray(int a[]) { 
        int maxSum = 0, thisSum = 0; 
        for (int j = 0; j < a.size(); j++) {
            thisSum += a[j]; 
            if (thisSum > maxSum) 
                maxSum = thisSum;
            else if (thisSum < 0) 
                thisSum = 0;    
        }
        return maxSum; 
    }
}