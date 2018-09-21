// leetcode 238 problem
// 给定一个数组num，输出一个相同维数的数组，每个元素等于除了num[i]之外所有元素的乘积(不能用除法)

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        // 求前n-1个元素的乘积
        for (int i = 1; i < n; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        // 补上后面的元素乘积
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}