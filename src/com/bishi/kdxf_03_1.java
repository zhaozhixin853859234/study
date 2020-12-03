package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-31 15:14
 */
public class kdxf_03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = str.length;
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(str[i]);
        }


    }
}
