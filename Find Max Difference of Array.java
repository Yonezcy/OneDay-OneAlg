// 求数组中两个数相减的最大值
// dp解法，每一步循环都找到差值的max和最小元素min
class Solution {
	public int max_difference(int[] a){
        int len = a.length;
        if (len < 2) {
            return 0;
        }
        int min = Math.min(a[0], a[1]);
        int max_diff = a[1] - a[0];
        for (int i = 2; i < len; i++) {
            if (a[i] - min > max_diff) {
                max_diff = a[i] - min;
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return max_diff;
    }
}