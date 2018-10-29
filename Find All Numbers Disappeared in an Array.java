// leetcode 448 problem
// 在一维数组中寻找顺序缺失的数

class Solution {
     public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            // Due to 1<=a[i]<=n
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
}