package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 * @author : zhao
 * @version :
 * @date : 2020-05-28 10:35
 */
public class MinPath64 {

    public static void main(String[] args) {
        int[][] a = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(a));
    }
    public static int minPathSum(int[][] grid) {
        if (grid.length==0)
            return 0;

        int rows = grid.length;
        int columns = grid[0].length;

        // 初始化第0行第0列
        for (int i = 1; i < rows; i++) {
            grid[i][0] = grid[i-1][0]+grid[i][0];
        }

        for (int i = 1; i <columns ; i++) {
            grid[0][i] = grid[0][i-1]+grid[0][i];
        }

        for (int i = 1; i <rows ; i++) {
            for (int j = 1; j < columns; j++) {
                // 递推公式
                grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1]) + grid[i][j];
            }
        }

        return grid[rows-1][columns-1];
    }
}
