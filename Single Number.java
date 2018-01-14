// leetcode 136 problem
// 数组中所有数字出现两次，只有一个出现一次，求出它

class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) return 0;
        
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i]; 
        }
        return res;
    }
}