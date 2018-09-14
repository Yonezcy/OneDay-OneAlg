// leetcode 215 problem
// 找出无序数组中第k大的元素

// Solution 1: Sort - O(NlogN).
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
}

// Solution 2: Select - O(N) guaranteed.
public class Solution{
	public int findKthLargest(int[] nums, int k) {
		// Shuffle to prevent the worst case.
		shuffle(nums);
        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (i < hi && a[++i] < a[lo]);
            while (j > lo && a[lo] < a[--j]);
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, lo, j);
        return j;
    }

    private void swap(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private void shuffle(int a[]) {
        final Random random = new Random();
        for (int ind = 1; ind < a.length; ind++) {
            final int r = random.nextInt(ind+1);
            swap(a, ind, r);
        }
    }
}
