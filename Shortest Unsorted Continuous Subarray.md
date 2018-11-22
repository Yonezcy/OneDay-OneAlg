###  

### Leetcode 581 problem

### 找出一个数组的最短子串使得子串排序后整个数组呈升序

Here are total six solutions for this question.  Each solution happens to be in time complexity descending order. 

#### Solution 1: Brute forth.

Idea: In the brute force approach, we consider every possible subarray that can be formed from the given array numsnums. For every subarray nums[i:j] considered, we need to check whether this is the smallest unsorted subarray or not. Thus, for every such subarray considered, we find out the maximum and minimum values lying in that subarray given by maxmax and minmin respectively.

If the subarrays nums[0:i−1] and nums[j:n−1] are correctly sorted, then only nums[i:j] could be the required subrray. Further, the elements in nums[0:i−1] all need to be lesser than the minmin for satisfying the required condition. Similarly, all the elements in nums[j:n−1]need to be larger than maxmax. We check for these conditions for every possible i and j selected.

Further, we also need to check if nums[0:i−1] and nums[j:n−1] are sorted correctly. If all the above conditions are satisfied, we determine the length of the unsorted subarray as j-i. We do the same process for every subarray chosen and determine the length of the smallest unsorted subarray found.

```java
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j <= nums.length; j++) {
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
                int prev = Integer.MIN_VALUE;
                for (int k = i; k < j; k++) {
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
                if ((i > 0 && nums[i - 1] > min) || (j < nums.length && nums[j] < max))
                    continue;
                int k = 0;
                while (k < i && prev <= nums[k]) {
                    prev = nums[k];
                    k++;
                }
                if (k != i)
                    continue;
                k = j;
                while (k < nums.length && prev <= nums[k]) {
                    prev = nums[k];
                    k++;
                }
                if (k == nums.length) {
                    res = Math.min(res, j - i);
 				 }
            }
        }
        return res;
    }
}
```

Time: $ O(n^3) $ 

Space: $ O(1) $  



#### Solution 2: Better brute forth

Idea: In this approach, we make use of an idea based on selection sort. We can traverse over the given numsnums array choosing the elements nums[i]. For every such element chosen, we try to determine its correct position in the sorted array. For this, we compare nums[i] with every nums[j], such that i<j<n. Here, nn refers to the length of numsnums array.

If any nums[j] happens to be lesser than nums[i], it means both nums[i] and nums[j] aren't at their correct position for the sorted array. Thus, we need to swap the two elements to bring them at their correct positions. Here, instead of swapping, we just note the position of nums[i] and nums[j] (These two elements now mark the boundary of the unsorted subarray(atleast for the time being).

Thus, out of all the nums[i] chosen, we determine the leftmost nums[i] which isn't at its correct position. This marks the left boundary of the smallest unsorted subarray(l). Similarly, out of all the nums[j]'s considered for all nums[i]'s we determine the rightmost nums[j] which isn't at its correct position. This marks the right boundary of the smallest unsorted subarray(r).

Thus, we can determine the length of the smallest unsorted subarray as r - l + 1.

```java
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l = nums.length, r = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    r = Math.max(r, j);
                    l = Math.min(l, i);
                }
            }
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
}
```

Time: $ O(n^2) $

Space: $ O(1) $



#### Solution 3: Sorting

Idea: We can sort a copy of the given array numsnums, say given by nums_sorted. Then, if we compare the elements of nums andnums_sorted, we can determine the leftmost and rightmost elements which mismatch. The subarray lying between them is, then, the required shorted unsorted subarray.

```java
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = snums.length, end = 0;
        for (int i = 0; i < snums.length; i++) {
            if (snums[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        return (end - start >= 0 ? end - start + 1 : 0);
    }
}

```

Time: $ O(nlogn) $

Space: $ O(1) $



#### Solution 4: Using stack







#### Solution 5: Without extra space







#### Solution 6: Two pointer trick

```java
class Solution {
    public int findUnsortedSubarray(int[] A) {
        int n = A.length, begin = -1, end = -2, min = A[n-1], max = A[0];
        for (int i = 1; i < n; i++) {
          max = Math.max(max, A[i]);
          min = Math.min(min, A[n-1-i]);
          if (A[i] < max) end = i;
          if (A[n-1-i] > min) begin = n - 1 - i;
        }
        return end - begin + 1;
    }
}
```

Time: $ O(n) $

Space: $ O(1) $



### END

