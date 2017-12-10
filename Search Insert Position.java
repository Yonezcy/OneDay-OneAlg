// leetcode 35th problem Search Insert Position
// Given a sorted array and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.
// You may assume no duplicates in the array.
// Binary search solution
class Solution {
    public int searchInsert(int[] A, int target) {
        int low = 0, high = A.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (A[mid] == target) return mid;
            else if (A[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}