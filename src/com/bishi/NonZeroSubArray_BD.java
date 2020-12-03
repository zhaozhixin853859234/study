package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-25 10:10
 */

public class NonZeroSubArray_BD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.useDelimiter("\n");
        String[] str = sc.next().split(" ");

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(str[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int tmp = input[i];
            if (tmp!=0)
                count++;
            for (int j = i+1; j <n ; j++) {
                tmp+=input[j];
                if (tmp!=0)
                    count++;
                else
                    break;
                }

        }
        count = input[n-1]==0?count:count+1;
        System.out.println(count);
    }
}
