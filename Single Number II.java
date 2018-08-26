// leetcode 137 problem
// 数组中每个数都出现3次，只有1个数出现1次，找出它

// Let ‘one’ represents the first bit, ‘two’ represents the second bit. Then we need to set rules for ‘one’ 
// and ‘two’ so that they act as we hopes. The complete loop is 00->10->01->00(0->1->2->3/0).
class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) return 0;
        int one = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            one = (one ^ nums[i]) & (~two);
            two = (two ^ nums[i]) & (~one);
        }
        return one;
    }
}