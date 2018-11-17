// leetcode 560 problem
// 求和为k的子串的个数

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // 如果之前有存在presum且presum+k=sum，说明遍历至此一定存在和为k的子串，数量取决于presum的数量
            if (preSum.containsKey(sum-k)) {
                result += preSum.get(sum-k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}