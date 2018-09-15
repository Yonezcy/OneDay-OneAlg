// leetcode 217 problem
// 判断数组中是否存在相同的整数

// O(NlogN) Solution.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}

// O(N) Solution.
class Solution {
	public boolean containsDuplicate(int[] nums) {
	    Set<Integer> distinct = new HashSet<Integer>();
	    for (int num : nums) {
	        if (distinct.contains(num)) {
	            return true;
	        }
	        distinct.add(num);
	    }
	    return false;
	}
}