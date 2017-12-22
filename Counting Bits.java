// leetcode 338th problem
// 找出0-n序列中，每个数的二进制表示中1的个数

class Solution {
    public int[] countBits(int num) {
        int f[] = new int[num + 1];
        f[0] = 0;
        for (int i = 1; i <= num; i++) 
        	// f[i] = f[i/2] + (i%2)
            f[i] = f[i >> 1] + (i & 1);
        return f;
    }
}