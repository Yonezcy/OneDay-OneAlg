// leetcode 169th problem
// 寻找数组中的主元（出现次数大于n／2的元素，主元始终存在）

// Solution 1: Sort.
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

// Solution 2: Count.
class Solution {
    public int majorityElement(int[] num) {
		int major = num[0], count = 1;
        for (int i = 1; i < num.length; i++) {
            if (count == 0) {
                count++;
                major = num[i];
            } else if (major == num[i]) {
                count++;
            } else count--;
            
        }
        return major;
    }
}