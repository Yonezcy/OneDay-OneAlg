// Single number problem
class Solution {
public int singleNumber(int A[], int n) {
    int x = 0;
    for (int i = 0; i < n; i++)
    	// 异或可消除两个相同位
    	x ^= A[i];
    return x;
  }
};