package com.bishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-31 14:59
 */
public class kdxf_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.useDelimiter("\n");
        String[] str = sc.next().split(" ");

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(str[i]);
        }
        System.out.println(Arrays.toString(input));

    }
}
