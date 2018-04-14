// leetcode 698 problem
// 判断是否能将数组划分为k个sum相同的子数组

// DFS Solution

'''
Update: This question has been changed after the contest. It added the special restriction 0 < nums[i] < 10000.
 My solution here is without that consideration.

Assume sum is the sum of nums[] . The dfs process is to find a subset of nums[] which sum equals to sum/k. 
We use an array visited[] to record which element in nums[] is used. Each time when we get a cur_sum = sum/k, 
we will start from position 0 in nums[] to look up the elements that are not used yet and find another 
cur_sum = sum/k.

An corner case is when sum = 0, my method is to use cur_num to record the number of elements in the current 
subset. Only if cur_sum = sum/k && cur_num >0, we can start another look up process.
'''

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (k <= 0 || sum % k != 0) return false;
        int[] visited = new int[nums.length];
        return canPartition(nums, visited, 0, k, 0, 0, sum/k);
    }
    
    public boolean canPartition(int[] nums, int[] visited, int start_index, int k, int cur_sum, int cur_num, int target){
        if (k == 1) return true;
        if (cur_sum == target && cur_num > 0) return canPartition(nums, visited, 0, k-1, 0, 0, target);
        for (int i = start_index; i < nums.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                if (canPartition(nums, visited, i+1, k, cur_sum + nums[i], cur_num++, target)) return true;
                visited[i] = 0;
            }
        }
        return false;
    }
}