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
    public static int removeDuplicates2(int[] nums) {
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