// leetcode 476 problem
// 求一个正数的补数（二进制每一位按位取反）

class Solution {
    public int findComplement(int num) {
    	// ～ 虽然可以取反，但是前面全都为1，因为int是32位的
    	// Integer.highestOneBit(num) 得到num的最高位，后面全补0
    	// 左移一位减1后就全为1，前面都是0
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}