package com.leetcode.easy;

public class FindNum {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if((matrix.length==0)||(matrix.length==1&&matrix[0].length==0))
            return false;
        else {
            int rowLength = matrix.length;
            int columnLength = matrix[0].length;
            int maxRow = 0;
            int minRow = 0;
            for (int i = 0; i < rowLength; i++) {
                if (matrix[i][0] > target)
                    maxRow = i - 1;
            }
            for (int i = maxRow; i >= 0; i--) {
                if (matrix[i][columnLength - 1] < target)
                    minRow = i + 1;
            }
            for (int i = minRow; i < maxRow; i++) {
                for (int j = 0; j < columnLength; j++) {
                    if (matrix[i][j] == target)
                        return true;
                }
            }
            return false;
        }

    }
}
