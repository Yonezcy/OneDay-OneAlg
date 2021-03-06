// leetcode 209 problem
// 求正数数组中和大于target的最短子串长度(O(n))

// Two Pointers Solution.
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0, j = 0;
        int sum = 0, min = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= s) {
                min = Math.min(min, j-i);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}