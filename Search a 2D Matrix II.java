// leetcode 240th problem
// 在行列递增的二维数组里查找某个数

// Solution1: Begin at right top corner.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >= 0 && row <= matrix.length-1) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
}

// Solution2: Begin at left bottom corner.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int col = 0;
        int row = matrix.length - 1;
        while (col <= matrix[0].length-1 && row >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                row--;
            } else if (target > matrix[row][col]) {
                col++;
            }
        }
        return false;
    }
}