// leetcode 463 problem
// 求出矩阵中值为1的格子的边缘条纹的数量

class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    if (i < grid.length - 1 && grid[i+1][j] == 1) neighbours++; // count down neighbours
                    if (j < grid[i].length - 1 && grid[i][j+1] == 1) neighbours++; // count right neighbours
                }
            }
        }
        return islands * 4 - neighbours * 2;
    }
}