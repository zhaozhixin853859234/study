package com.leetcode.easy;

import java.util.*;

public class PrintReverseArray {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0)
            return new int[0];
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] res = new int[rows*columns];
        int index = 0;

        while (true){
            for (int i:matrix[0]) {
                res[index++] = i;
            }

            matrix = Arrays.copyOfRange(matrix,1,matrix.length);

            if (matrix.length==0)
                break;

            rows = matrix.length;
            columns = matrix[0].length;

            int[][] ans = new int[columns][rows];
            // 理解此处的旋转过程
            for (int i = columns-1; i >=0 ; i--) {
                for (int j = 0; j <rows ; j++) {
                    ans[columns-i-1][j] = matrix[j][i];
                }
            }
            matrix = ans;
        }
        return res;
    }
}
