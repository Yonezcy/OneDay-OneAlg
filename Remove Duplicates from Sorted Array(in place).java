// leetcode 26 problem
// 在有序数组中删除重复的元素，返回数组长度

class Solution {
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        int validLength = 0;
        for (int i=0; i<len; i++) {
            if (!map.containsKey(nums[i])) {
                validLength++;
                map.put(nums[i], i);
            }
        }
        return validLength;
    }
}

class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}