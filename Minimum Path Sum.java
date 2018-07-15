// leetcode 64 problem
// 找出矩阵左上角到右下角的最短路径和

class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 1; i < rows; i++) 
            grid[i][0] = grid[i][0] + grid[i-1][0];
        for (int j = 1; j < cols; j++) 
            grid[0][j] = grid[0][j] + grid[0][j-1];
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                // 当前最短路径 = grid[i][j] + 左边和上边路径的较小者
                grid[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[rows-1][cols-1];
    }
}