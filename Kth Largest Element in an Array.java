// leetcode 215 problem
// 找出无序数组中第k大的元素

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
    }
}