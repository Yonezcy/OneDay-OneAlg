// Single number problem
// 数组中所有数字出现两次，只有一个出现一次，求出它
class Solution {
public int singleNumber(int A[], int n) {
    int x = 0;
    for (int i = 0; i < n; i++)
    	// 异或可消除两个相同位
    	x ^= A[i];
    return x;
  }
};