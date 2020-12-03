package com.leetcode.medium;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-09 15:26
 */
public class NumSquares_279 {
    public static int numSquares(int n) {
        int[] res = new int[n+1];
        res[0] = 0;

        for (int i = 1; i < n+1; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 1; j <=Math.sqrt(i) ; j++) {
                temp = Math.min(res[i-j*j]+1,temp);
            }
            res[i] = temp;
        }
        return res[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numSquares(n));
    }


}
