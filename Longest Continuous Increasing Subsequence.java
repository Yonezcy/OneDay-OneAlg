// leetcode 674 problem
// 求最长递增子串的长度

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int maxLength, curLength;
        maxLength = curLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) maxLength = Math.max(maxLength, ++curLength);
            else curLength = 1;
        }
        return maxLength;
    }
}