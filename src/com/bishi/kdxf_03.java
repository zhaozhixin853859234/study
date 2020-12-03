package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-31 14:23
 */
public class kdxf_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = str.length;
        if (n<8)
            System.out.println(0);
        else {
            int[] input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(str[i]);
            }

            int hengMinBefore,hengMaxBefore,hengMinAfter,hengMaxAfter,shuMinBefore,shuMaxBefore,shuMinAfter,shuMaxAfter;

            hengMaxBefore = Math.max(input[0], input[2]);
            hengMinBefore = Math.min(input[0], input[2]);
            hengMaxAfter = Math.max(input[4], input[6]);
            hengMinAfter = Math.min(input[4], input[6]);
            shuMaxBefore = Math.max(input[1],input[3]);
            shuMinBefore = Math.min(input[1],input[3]);
            shuMaxAfter = Math.max(input[5],input[7]);
            shuMinAfter = Math.min(input[5],input[7]);
            boolean flag = true;
            if (hengMaxAfter<hengMinBefore)
                flag = false;
            if (hengMinAfter>hengMaxBefore)
                flag = false;
            if (shuMaxAfter<shuMinBefore)
                flag = false;
            if (shuMinAfter>shuMaxBefore)
                flag = false;

            if (flag)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
