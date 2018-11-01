// leetcode 462 problem
// 将数组的各个元素多次加一或减一，使所有元素都相同，求操作的次数

// 中位数是target，不论odd or even
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int count = 0;
        while (i < j) {
            count += nums[j--] - nums[i++];
        }
        return count;
    }
}