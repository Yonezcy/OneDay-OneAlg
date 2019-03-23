// leetcode 4 problem
// 找出两个有序数组的中位数

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

// O(log(m+n) Solution.
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if (len1 > len2) return findMedianSortedArrays(nums2, nums1);
        int k = (len1 + len2 + 1) / 2;
        int l = 0, r = len1;
        while (l < r) {
            int m1 = (l + r) / 2;
            int m2 = k - m1;
            if (nums1[m1] < nums2[m2-1]) {
                l = m1 + 1;
            } else {
                r = m1;
            }
        }
        int m1 = l;
        int m2 = k - l;
        int c1 = Math.max(m1 <= 0 ? Integer.MIN_VALUE : nums1[m1-1], m2 <= 0 ? Integer.MIN_VALUE : nums2[m2-1]);
        if ((len1 + len2) % 2 == 1) return c1;
        int c2 = Math.min(m1 >= len1 ? Integer.MAX_VALUE : nums1[m1], m2 >= len2 ? Integer.MAX_VALUE : nums2[m2]);
        return (c1 + c2) / 2.0;
    }


    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        if (sc.hasNextLine()) {
            s = sc.nextLine();
            list.add(s);
        }
        if (sc.hasNextLine()) {
            s = sc.nextLine();
            list.add(s);
        }

        s = list.get(0);
        String[] s1 = s.split(" ");
        int[] nums1 = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            nums1[i] = Integer.parseInt(s1[i]);
        }

        s = list.get(1);
        String[] s2 = s.split(" ");
        int[] nums2 = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            nums2[i] = Integer.parseInt(s2[i]);
        }

        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}


