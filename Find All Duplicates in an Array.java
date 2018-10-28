// leetcode 442 problem
// 找出数组中所有重复的元素(O(n) with out extra space)

class Solution {
    // when find a number i, flip the number at position i-1 to negative. 
    // if the number at position i-1 is already negative, i is the number that occurs twice.
    
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // The reason of minus 1 is 1<=nums[i]<=len(nums).
            // The reason of abs is previous manipulation may lead to minus of latter elements.
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
}