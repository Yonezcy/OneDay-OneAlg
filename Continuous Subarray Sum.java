// leetcode 523 problem
// 找出数组中和为k的整数倍的子串（子串元素>1）

// (a+(n*x))%x is same as (a%x)
// For e.g. in case of the array [23,2,6,4,7] the running sum is [23,25,31,35,42] and 
// the remainders are [5,1,1,5,0]. We got remainder 5 at index 0 and at index 3. That means, 
// in between these two indexes we must have added a number which is multiple of the k.

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // put(0, -1)的目的是为了i - prev > 1此判断条件
        map.put(0, -1);
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (k != 0) runningSum %= k; 
            Integer prev = map.get(runningSum);
            if (prev != null) {
                if (i - prev > 1) return true;
            }
            else map.put(runningSum, i);
        }
        return false;
    }
}