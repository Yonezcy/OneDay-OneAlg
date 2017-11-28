// leetcode 120th problem
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] A = new int[triangle.size()+1][triangle.size()+1];
        // 从下至上，dp解法；若从上至下，要考虑很多边界问题
        for(int i=triangle.size()-1; i>=0; i--) {
            for(int j=0; j<triangle.get(i).size(); j++) {
                A[i][j] = Math.min(A[i+1][j], A[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return A[0][0];
    }
}