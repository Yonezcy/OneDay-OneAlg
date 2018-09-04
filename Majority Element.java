// leetcode 169th problem
// 寻找数组中的主元（出现次数大于n／2的元素）

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}