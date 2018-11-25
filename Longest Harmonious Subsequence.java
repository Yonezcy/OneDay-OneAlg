// leetcode 594 problem
// 求数组中最长和谐子序列（最大最小元素的差为1）的长度

class Solution {
    public int findLHS(int[] nums) {
        Map<Long, Integer> map = new HashMap<>();
        for (long num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (long key : map.keySet()) {
            if (map.containsKey(key+1)) {
                result = Math.max(result, map.get(key+1) + map.get(key));
            }
        }
        return result;
    }
}