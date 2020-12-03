package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-08-29 16:28
 */
public class MT_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        int m = Integer.parseInt(str1[0]);
        int n = Integer.parseInt(str1[1]);

        String[] str = sc.nextLine().split(" ");
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(str[i]);
        }

        int count =0;
        for (int i = 1; i <m+1 ; i++) {
            for (int j = i; j <m+1 ; j++) {
                int lastValue = 0;
                boolean flag = true;
                for (int k = 0; k < n; k++) {
                    int temp = input[k];
                    if ((temp>0&&temp<i)||(temp>j&&temp<m+1)){
                        if (temp<lastValue){
                            flag =false;
                            break;
                        }
                        else
                            lastValue = temp;
                    }
                }
                count = flag?count+1:count;

            }
        }

        System.out.println(count);
    }
}
