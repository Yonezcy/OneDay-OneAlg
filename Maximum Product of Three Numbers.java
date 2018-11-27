// leetcode 628 problem
// 求数组中三个数的最大乘积

class Solution {
    public int maximumProduct(int[] nums) {
         Arrays.sort(nums);
         int a = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
         // 要考虑到负数情况
         int b = nums[0] * nums[1] * nums[nums.length-1];
         return a > b ? a : b;
    }
}