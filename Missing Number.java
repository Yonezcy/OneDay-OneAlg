// leetcode 268 problem
// 找出有序数组中缺失的元素

class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) return 0;
        
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++)
            xor ^= nums[i] ^ i;
        // 经过异或后，剩下缺失的元素和最大的元素，i经过++后即成为了最大的元素，异或可得最终结果
        return xor ^ i;
    }
}