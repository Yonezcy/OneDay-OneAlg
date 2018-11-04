// leetcode 485 problem
// 找出一维数组中最大连续的1的个数

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            }
            else count = 0;
        }
        return max;
    }
}