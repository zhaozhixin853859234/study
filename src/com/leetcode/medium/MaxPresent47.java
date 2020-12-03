package com.leetcode.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-09 15:45
 */
public class MaxPresent47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         List<List<Integer>> lists = new LinkedList<>();
        String[] str = sc.nextLine().split(",");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int count = 0;
        int[][] input = new int[m][n];
        while (count<n){
            String[] s = sc.nextLine().split(" ");
            List<Integer> tmp = new LinkedList<>();
            for (int i = 0; i < s.length; i++) {
                tmp.add(Integer.parseInt(s[i]));
            }
            lists.add(tmp);
            count++;
        }

        //int[][] input = new int[lists.size()][lists.get(0).size()];
        for (int i = 0; i <lists.size() ; i++) {
            for (int j = 0; j < lists.get(0).size() ; j++) {
                input[i][j] = lists.get(i).get(j);
            }
        }

        System.out.println(maxValue(input));

//        for (List<Integer> l:lists) {
//            for (int i:l) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

    }

    public static int maxValue(int[][] grid) {
        if (grid.length==0)
            return 0;
        int rows = grid.length;
        int columns = grid[0].length;

        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];


        //初始化
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }

        for (int i = 1; i < columns; i++) {
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }

//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(Arrays.toString(dp));

        for (int i = 1; i <rows ; i++) {
            for (int j = 1; j < columns; j++) {
                dp[i][j] = Math.max((dp[i-1][j] + grid[i][j]),(dp[i][j-1] + grid[i][j]));
            }
        }

        return dp[rows-1][columns-1];
    }

}
