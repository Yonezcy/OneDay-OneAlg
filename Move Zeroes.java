// leetcode 283 problem
// 将一维数组中的非零元素按原来的顺序移到0元素的前面

class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;
        int insertPosition = 0;
        for (int num: nums) 
            if (num != 0) nums[insertPosition++] = num;
        while (insertPosition < nums.length) 
            nums[insertPosition++] = 0;
    }
}