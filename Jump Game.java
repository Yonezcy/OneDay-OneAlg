// leetcode 55th problem
// Jump Game

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length, index = n - 1;
        for (int i = n-2; i >= 0; i--) {
            if (i + nums[i] >= index)
                index = i;
        }
        return index <= 0;
    }
}