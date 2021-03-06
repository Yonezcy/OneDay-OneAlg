// leetcode 560 problem
// 求和为k的子串个数

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // 如果之前有存在presum且presum+k=sum，说明遍历至此一定存在和为k的子串，数量取决于presum的数量
            // if we know SUM[0, i-1] and SUM[0, j], then we can easily get SUM[i, j].
            // we can prove that all the SUM[i, j] could be calculated.
            if (preSum.containsKey(sum-k)) {
                result += preSum.get(sum-k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}