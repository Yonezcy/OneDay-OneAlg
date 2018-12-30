// leetcode 27 problem
// 删除数组中的给定元素，返回剩余数组的长度（in-place）

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n-1];
                // Reduce array size by one.
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}