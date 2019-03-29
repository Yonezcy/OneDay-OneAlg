// leetcode 1020 problem
// 判断数组能否被划分成三个等和的子串，index从0到length-1且两两子串相邻

class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length == 0) return false;
        int sum = 0;
        for (int i = 0; i < A.length; i++) sum += A[i];
        if (sum % 3 != 0) return false;
        int target = sum / 3;
        int curSum = 0, partition = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            if (curSum == target) {
                curSum = 0;
                partition++;
            }
        }
        return partition == 3;
    }
}